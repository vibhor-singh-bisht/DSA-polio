import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] brute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two elements add to make target value");
    }

    // above approach is the brute force
    // time complexity - O(N^2)

    public int[] hashmapSolution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[] { map.get(value), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no such numbers add up to target value");
    }

    // above approach is optimised with Hashmap and only one loop
    // time complexity is O(n)

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = { 2, 4, 7, 5, 11 };
        int target = 9;

        int[] result = obj.brute(nums, target);
        int[] resultwithhashmap = obj.hashmapSolution(nums, target);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(resultwithhashmap));

    }
}