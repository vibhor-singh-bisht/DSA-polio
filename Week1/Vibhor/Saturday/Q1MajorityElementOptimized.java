package Week1.Vibhor.Saturday;

import java.util.HashMap;

public class Q1MajorityElementOptimized {
    class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else map.put(nums[i],map.get(nums[i])+1);
        }
        for( int m : map.keySet()){
            if(map.get(m) > nums.length/2) return m;
        }
        return 1;
    }
}
    public static void main(String[] args) {

        Q1MajorityElementOptimized solution = new Q1MajorityElementOptimized();
        Solution obj = solution.new Solution();

        int[] nums = {3, 2, 3};

        int result = obj.majorityElement(nums);

        System.out.println(result);
    }
    
}
