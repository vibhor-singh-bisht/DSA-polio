import java.util.HashMap;
import java.util.Map;

// Map: stores KEY -> VALUE pairs. Keys are unique, values can repeat.
// Choose HashMap, LinkedHashMap, or TreeMap depending on ordering needs.
public class MapReference {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(); // interface -> implementation

        // put / get
        map.put(1, 100);
        map.put(2, 200);
        map.put(1, 111); // overwrites the value for key 1

        System.out.println("get(1): " + map.get(1));
        System.out.println("get(missing): " + map.get(99)); // null if key absent

        // getOrDefault - avoids manual null checks, great for counting patterns
        System.out.println("getOrDefault(99, 0): " + map.getOrDefault(99, 0));

        // containsKey / containsValue
        System.out.println("containsKey(2): " + map.containsKey(2));
        System.out.println("containsValue(200): " + map.containsValue(200));

        // remove
        map.remove(2);
        System.out.println("after remove(2): " + map);

        // size / isEmpty / clear
        System.out.println("size(): " + map.size());
        System.out.println("isEmpty(): " + map.isEmpty());

        map.put(3, 300);
        map.put(4, 400);

        // keySet / values / entrySet - the three main "views" of a map
        System.out.println("keySet(): " + map.keySet());
        System.out.println("values(): " + map.values());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        }

        // merge / compute / putIfAbsent - useful shortcuts for frequency counting
        map.merge(3, 1, Integer::sum);         // adds 1 to existing value, or inserts if absent
        map.putIfAbsent(5, 500);               // only inserts if key is not already present
        map.computeIfAbsent(6, k -> 0);        // ensures key exists with a default
        System.out.println("after merge/putIfAbsent/computeIfAbsent: " + map);

        map.clear();
        System.out.println("after clear, isEmpty: " + map.isEmpty());
    }
}
