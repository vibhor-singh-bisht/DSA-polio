import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

// TreeMap: keys kept in SORTED order (natural or comparator). Backed by a red-black tree.
// put/get/remove/containsKey: O(log n).
// Use when you need sorted keys or navigation methods (floorKey/ceilingKey/etc.).
public class TreeMapReference {

    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>(); // interface -> implementation

        map.put(5, "five");
        map.put(1, "one");
        map.put(3, "three");

        System.out.println("sorted by key: " + map); // {1=one, 3=three, 5=five}

        System.out.println("firstKey(): " + map.firstKey());
        System.out.println("lastKey(): " + map.lastKey());

        // Navigation methods - useful for "closest key" DSA problems
        System.out.println("floorKey(4): " + map.floorKey(4));     // largest key <= 4
        System.out.println("ceilingKey(4): " + map.ceilingKey(4)); // smallest key >= 4
        System.out.println("lowerKey(3): " + map.lowerKey(3));     // largest key < 3
        System.out.println("higherKey(3): " + map.higherKey(3));   // smallest key > 3

        System.out.println("pollFirstEntry(): " + map.pollFirstEntry());
        System.out.println("remaining: " + map);

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
