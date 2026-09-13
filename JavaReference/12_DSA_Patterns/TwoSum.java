import java.util.Map;
import java.util.HashMap;

// Pattern: Two Sum using a HashMap for O(n) time instead of the O(n^2) brute force.
// Store each visited value -> index, and check if the complement was already seen.
public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (valueToIndex.containsKey(complement)) {
                return new int[]{valueToIndex.get(complement), i};
            }
            valueToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("indices: [" + result[0] + ", " + result[1] + "]");
    }
}
