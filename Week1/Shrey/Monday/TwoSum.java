import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
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


    

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = { 2, 4, 7, 5, 11 };
        int target = 9;

        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}