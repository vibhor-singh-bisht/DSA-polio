package Week2.Vibhor.Tuesday;

import java.util.HashMap;


public class Q1Optimized {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap <Integer,Integer> map = new HashMap<>();
            for( int i = 0 ; i < nums.length ; i++){
                int remaining = target - nums[i];
                if( map.containsKey(remaining)) return new int[]{i,map.get(remaining)};
                else {
                    map.put(nums[i],i);
                }
            }
            return new int []{0,0};
        }
    }

    public static void main(String[] args) {

        Q1Optimized solution = new Q1Optimized();
        Solution obj = solution.new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }


}
