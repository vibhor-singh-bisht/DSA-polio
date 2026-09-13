import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Conversions between arrays and Lists, plus a few quick array construction helpers.
// For sort/search/fill/copy/equals see 08_Utilities/ArraysReference.java.
public class ArraysUtility {

    public static void main(String[] args) {
        Integer[] boxedArr = {3, 1, 2};

        // Array -> List (fixed-size, backed by the array, no add/remove!)
        List<Integer> fixedList = Arrays.asList(boxedArr);
        System.out.println("Arrays.asList: " + fixedList);

        // Array -> mutable ArrayList (safe to add/remove afterward)
        List<Integer> mutableList = new ArrayList<>(Arrays.asList(boxedArr));
        mutableList.add(4);
        System.out.println("mutable list after add: " + mutableList);

        // List -> array
        Integer[] backToArray = mutableList.toArray(new Integer[0]);
        System.out.println("back to array: " + Arrays.toString(backToArray));

        // Primitive int[] cannot use Arrays.asList directly (it treats the whole array
        // as ONE element) - convert manually or use streams:
        int[] primitives = {5, 6, 7};
        List<Integer> fromPrimitives = new ArrayList<>();
        for (int v : primitives) fromPrimitives.add(v);
        System.out.println("from primitives: " + fromPrimitives);

        // Arrays.copyOfRange - extract a sub-array
        int[] sub = Arrays.copyOfRange(primitives, 1, 3);
        System.out.println("copyOfRange: " + Arrays.toString(sub));

        // java.util.stream also works for conversions
        int[] streamed = fromPrimitives.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("stream to int[]: " + Arrays.toString(streamed));
    }
}
