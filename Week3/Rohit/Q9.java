package Week3.Rohit;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefixSum = 0;
// Logic: Since we needed a continuous subarray of length >=2 with equal to sum
// So consider if i = 1 and j = i+1, we need prefixSum[j] - prefixSum[i-1] % k == 0
// which implies prefixSum[j] % k == prefixSum[i-1] % k
// So we for each prefixSum we did a % k and check if in map if there exist a remainder with same value
// If yes then we did a check for length>=2 if yes then return true
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int rem = prefixSum % k;

            if (map.containsKey(rem)) {
                int prevIndex = map.get(rem);

                if (i - prevIndex >= 2)
                    return true;
            } else {
                map.put(rem, i);
            }
        }
        return false;
    }
}

