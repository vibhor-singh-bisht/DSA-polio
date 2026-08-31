package Week1.Vibhor.Monday;

import java.util.Arrays;

public class Question2 {

    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {

        Question2 solution = new Question2();

        int[] nums = {1, 2, 3, 4, 5};

        int[] result = solution.runningSum(nums);

        System.out.println(Arrays.toString(result));
    }
}