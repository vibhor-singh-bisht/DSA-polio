import java.util.HashSet;
import java.util.Set;

// Pattern: detect duplicates using a HashSet for O(1) average lookups. O(n) time, O(n) space.
public class DuplicateDetection {

    static boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (!seen.add(n)) { // add() returns false when the value already exists
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] withDupes = {1, 2, 3, 2, 5};
        int[] noDupes = {1, 2, 3, 4, 5};

        System.out.println("withDupes has duplicate: " + hasDuplicate(withDupes));
        System.out.println("noDupes has duplicate: " + hasDuplicate(noDupes));
    }
}
