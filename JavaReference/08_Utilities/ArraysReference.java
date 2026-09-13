import java.util.Arrays;

// java.util.Arrays: static helper methods for working with arrays.
public class ArraysReference {

    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1, 9};

        // sort - ascending, in place. O(n log n)
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        System.out.println("sort: " + Arrays.toString(sorted));

        // sort a range [from, to)
        int[] partial = {5, 4, 3, 2, 1};
        Arrays.sort(partial, 1, 4);
        System.out.println("sort range: " + Arrays.toString(partial));

        // binarySearch - array MUST be sorted first. O(log n)
        int index = Arrays.binarySearch(sorted, 8);
        System.out.println("binarySearch(8): " + index);

        // fill - set every element to the same value. O(n)
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("fill: " + Arrays.toString(filled));

        // copyOf - copy with a new length (truncates or pads with zeros/nulls)
        int[] copy = Arrays.copyOf(nums, 3);
        int[] extended = Arrays.copyOf(nums, 7);
        System.out.println("copyOf shorter: " + Arrays.toString(copy));
        System.out.println("copyOf longer: " + Arrays.toString(extended));

        // equals - compares contents, not references
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("a == b: " + (a == b));
        System.out.println("Arrays.equals(a, b): " + Arrays.equals(a, b));

        // toString - readable 1D representation
        System.out.println("toString: " + Arrays.toString(nums));

        // deepToString - needed for 2D+ arrays, toString() alone shows garbage references
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("plain toString (wrong): " + Arrays.toString(matrix));
        System.out.println("deepToString (correct): " + Arrays.deepToString(matrix));
    }
}
