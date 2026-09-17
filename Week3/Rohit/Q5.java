package Week3.Rohit;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {

        // nums = {1,2,3,-3,1,1,1,4,2,-3};
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        // Before the array begins, we've seen a prefix sum of 0 once.So while iterating
        // "prefixSum - k == 0" We know that we got a subarray with sum equal to k.
        map.put(0, 1);

        for (int n : nums) {
            prefixSum += n;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;

    }
}
