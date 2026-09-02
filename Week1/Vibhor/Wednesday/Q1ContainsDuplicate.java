package Week1.Vibhor.Wednesday;


import java.util.HashMap;


public class Q1ContainsDuplicate {


    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 3, 1};

        boolean result = obj.containsDuplicate(nums);

        System.out.println(result);
    }
}

class Solution {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }
}

