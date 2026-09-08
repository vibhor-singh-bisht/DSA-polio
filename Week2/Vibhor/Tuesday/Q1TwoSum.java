package Week2.Vibhor.Tuesday;

import java.util.HashMap;

public class Q1TwoSum {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        for( int i = 0 ; i < nums.length ; i ++ ){
            for ( int j = i +1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target)
                return new int[]{i,j};
            }
        }
        return new int []{};

}
    public static void main(String[] args) {

        Q1TwoSum solution = new Q1TwoSum();
        Solution obj = solution.new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
    
}
