package Week1.Vibhor.Monday;

import java.util.Arrays;

public class Question1 {
        public int[] twoSum(int[] nums, int target) {

        int [] result = new int[2];
        for(int i = 0 ; i < nums.length -1 ; i++){
            for(int j = i+1; j < nums.length ; j++)
                if(nums[i] + nums[j] == target){
                    result = new int[] {i,j};
                }
        }
        return result;
    }

    public static void main(String[] args) {

        Question1 solution = new Question1();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
