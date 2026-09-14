package Week3.Vibhor;

public class Q1RunningSum {
    class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
                nums[i]+=nums[i-1];
        }
        return nums;
    }
}
    public static void main(String[] args) {
        Solution sol = new Q1RunningSum().new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = sol.runningSum(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
