import java.util.LinkedHashMap;
import java.util.Map;

// LinkedHashMap: like HashMap but MAINTAINS insertion order (or access order if configured).
// put/get/remove: average O(1), slightly slower than HashMap due to linked list overhead.
// Common use case: LRU cache implementation (with accessOrder=true + removeEldestEntry).
public class LinkedHashMapReference {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("c", 3);
        map.put("a", 1);
        map.put("b", 2);

        System.out.println("insertion order preserved: " + map); // {c=3, a=1, b=2}

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // accessOrder=true turns this into an LRU-style ordering (most recently used goes last)
        LinkedHashMap<Integer, Integer> lru = new LinkedHashMap<>(16, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > 3; // simple fixed-capacity LRU cache
            }
        };
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        lru.get(1);       // access key 1 -> moves it to the end
        lru.put(4, 4);     // capacity exceeded -> evicts least recently used (key 2)
        System.out.println("LRU cache contents: " + lru);
    }
}
