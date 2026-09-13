import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

// TreeSet: no duplicates, elements kept in SORTED (natural or comparator) order.
// Backed by a red-black tree. add/remove/contains: O(log n).
// Use when you need sorted unique elements or navigation methods (floor/ceiling/etc.).
public class TreeSetReference {

    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>(); // interface -> implementation

        set.add(5);
        set.add(1);
        set.add(3);
        set.add(1); // duplicate ignored

        System.out.println("sorted order: " + set); // [1, 3, 5]

        System.out.println("first(): " + set.first());
        System.out.println("last(): " + set.last());

        // Navigation methods - very useful for "closest value" DSA problems
        System.out.println("floor(4): " + set.floor(4));     // largest <= 4  -> 3
        System.out.println("ceiling(4): " + set.ceiling(4)); // smallest >= 4 -> 5
        System.out.println("lower(3): " + set.lower(3));     // largest < 3   -> 1
        System.out.println("higher(3): " + set.higher(3));   // smallest > 3  -> 5

        System.out.println("pollFirst(): " + set.pollFirst()); // removes and returns smallest
        System.out.println("pollLast(): " + set.pollLast());   // removes and returns largest
        System.out.println("remaining: " + set);

        // Custom ordering with a Comparator (e.g., descending order)
        TreeSet<Integer> descending = new TreeSet<>(Comparator.reverseOrder());
        descending.add(1);
        descending.add(5);
        descending.add(3);
        System.out.println("descending TreeSet: " + descending);
    }
}
