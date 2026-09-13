import java.util.ArrayList;
import java.util.List;

// ArrayList: dynamic array. Duplicates allowed, insertion order preserved, not sorted.
// get/set: O(1). add at end: amortized O(1). add/remove at start or middle: O(n).
// contains/indexOf: O(n). Best default choice for most DSA problems needing a List.
public class ArrayListReference {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        System.out.println("get(1): " + list.get(1));
        list.set(1, "blueberry");
        System.out.println("after set: " + list);

        list.add(0, "start"); // O(n) - shifts all elements right
        System.out.println("after insert at 0: " + list);

        list.remove("cherry"); // O(n) - searches then shifts
        System.out.println("after remove(Object): " + list);

        System.out.println("size: " + list.size());
        System.out.println("contains(\"apple\"): " + list.contains("apple"));

        // Pre-sizing with initial capacity avoids resize overhead when size is known
        List<Integer> presized = new ArrayList<>(1000);

        // Sorting an ArrayList in place
        List<Integer> nums = new ArrayList<>(List.of(5, 3, 1, 4, 2));
        nums.sort(null); // natural order
        System.out.println("sorted: " + nums);

        System.out.println("presized capacity hint used: " + presized.isEmpty());
    }
}
