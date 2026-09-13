import java.util.LinkedHashSet;
import java.util.Set;

// LinkedHashSet: no duplicates, MAINTAINS insertion order, not sorted.
// add/remove/contains: average O(1) (slightly slower than HashSet due to linked list overhead).
// Use when you need a Set's uniqueness guarantee but also need to iterate in insertion order.
public class LinkedHashSetReference {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("banana");
        set.add("apple");
        set.add("cherry");
        set.add("apple"); // duplicate ignored, order unaffected

        System.out.println("insertion order preserved: " + set); // [banana, apple, cherry]

        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("contains(\"apple\"): " + set.contains("apple"));
    }
}
