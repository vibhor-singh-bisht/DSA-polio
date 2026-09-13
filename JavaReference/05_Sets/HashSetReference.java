import java.util.HashSet;
import java.util.Set;

// HashSet: no duplicates, NO ordering guarantee, elements NOT sorted.
// add/remove/contains: average O(1), worst case O(n) with many hash collisions.
// Most common DSA use case: fast duplicate detection / "have I seen this before?".
public class HashSetReference {

    public static void main(String[] args) {
        Set<String> seen = new HashSet<>();

        String[] words = {"cat", "dog", "cat", "bird"};
        for (String w : words) {
            if (!seen.add(w)) { // add() returns false if the element was already present
                System.out.println("Duplicate found: " + w);
            }
        }
        System.out.println("unique words: " + seen);

        // Classic DSA pattern: detect duplicates in an array
        int[] nums = {1, 2, 3, 2, 5};
        Set<Integer> hasDuplicate = new HashSet<>();
        boolean foundDup = false;
        for (int n : nums) {
            if (!hasDuplicate.add(n)) {
                foundDup = true;
                break;
            }
        }
        System.out.println("array has duplicate: " + foundDup);

        System.out.println("contains(\"dog\"): " + seen.contains("dog"));
    }
}
