import java.util.HashMap;
import java.util.Map;

// HashMap: no ordering guarantee, allows ONE null key and multiple null values.
// put/get/remove/containsKey: average O(1), worst case O(n) with many collisions.
// The most common map used for frequency counting / lookups in DSA problems.
public class HashMapReference {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("a", 10); // overwrite

        System.out.println("get(\"a\"): " + map.get("a"));
        System.out.println("getOrDefault(\"z\", -1): " + map.getOrDefault("z", -1));
        System.out.println("containsKey(\"b\"): " + map.containsKey("b"));
        System.out.println("containsValue(2): " + map.containsValue(2));

        map.remove("b");
        System.out.println("size(): " + map.size());
        System.out.println("isEmpty(): " + map.isEmpty());

        // Frequency counting pattern - the #1 HashMap use case in LeetCode
        int[] nums = {1, 2, 2, 3, 3, 3};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        System.out.println("frequency map: " + freq);

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " occurs " + e.getValue() + " times");
        }

        map.clear();
        System.out.println("after clear: " + map.isEmpty());
    }
}
