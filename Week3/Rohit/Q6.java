package Week3.Rohit;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // Initially the prefix sum of 0 is seen at index -1
        map.put(0, -1);
        int currSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            // As it is a binary array containing only 0s and 1s, we treat 0 as -1 and 1 as
            // 1 so in case we encounter sum = 0 or a key in map which already exists, we
            // can calculate the length of the subarray with equal number of 0s and 1s.
            currSum += (nums[i] == 0) ? -1 : 1;

            if (!map.containsKey(currSum)) {
                map.put(currSum, i);
            } else {
                maxLen = Math.max(maxLen, i - map.get(currSum));
            }

        }
        return maxLen;
    }
}
