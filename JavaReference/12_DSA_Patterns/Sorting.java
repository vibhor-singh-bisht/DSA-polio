import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Pattern: common ways to sort arrays and lists for DSA problems.
public class Sorting {

    public static void main(String[] args) {
        // Sorting a primitive array ascending - O(n log n)
        int[] arr = {5, 2, 8, 1, 9};
        Arrays.sort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));

        // Sorting a primitive array descending - requires boxing, since Arrays.sort(int[])
        // has no comparator overload
        Integer[] boxed = {5, 2, 8, 1, 9};
        Arrays.sort(boxed, Collections.reverseOrder());
        System.out.println("sorted descending: " + Arrays.toString(boxed));

        // Sorting a List ascending / descending
        List<Integer> list = new ArrayList<>(List.of(5, 2, 8, 1, 9));
        Collections.sort(list);
        System.out.println("list ascending: " + list);
        list.sort(Comparator.reverseOrder());
        System.out.println("list descending: " + list);

        // Sorting 2D arrays (e.g. intervals) by a specific column
        int[][] intervals = {{3, 4}, {1, 2}, {2, 6}};
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        System.out.println("intervals sorted by start: " + Arrays.deepToString(intervals));

        // Custom object sort with multiple keys is shown in ComparatorReference.java
    }
}
