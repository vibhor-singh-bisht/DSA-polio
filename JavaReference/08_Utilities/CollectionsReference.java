import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// java.util.Collections: static helper methods for working with List/Set/Map collections.
public class CollectionsReference {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 2, 8, 1, 9));

        // sort - ascending, in place. O(n log n)
        Collections.sort(list);
        System.out.println("sort: " + list);

        // reverse - in place. O(n)
        Collections.reverse(list);
        System.out.println("reverse: " + list);

        // max / min - O(n)
        System.out.println("max: " + Collections.max(list));
        System.out.println("min: " + Collections.min(list));

        // frequency - count occurrences of a value. O(n)
        List<Integer> withDupes = List.of(1, 2, 2, 3, 2);
        System.out.println("frequency(2): " + Collections.frequency(withDupes, 2));

        // swap - exchange elements at two indices. O(1)
        Collections.swap(list, 0, 1);
        System.out.println("after swap(0,1): " + list);

        // reverseOrder - a Comparator for descending sort, often passed to sort()/PriorityQueue
        List<Integer> descending = new ArrayList<>(List.of(3, 1, 4, 1, 5));
        descending.sort(Collections.reverseOrder());
        System.out.println("sorted descending: " + descending);

        // Other handy helpers
        System.out.println("emptyList(): " + Collections.emptyList());
        List<Integer> unmodifiable = Collections.unmodifiableList(list);
        System.out.println("unmodifiableList: " + unmodifiable);
    }
}
