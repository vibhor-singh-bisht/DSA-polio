package Week3.Rohit;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int count = 0;
        int sum = 0;

        for(int n:nums){
            sum += n;
            int mod = sum%k;
            // Convert negative remainder to positive remainder
            if(mod<0){
                mod += k;
            }

            if(map.containsKey(mod)){
                count += map.get(mod);
            }
            map.put(mod, map.getOrDefault(mod,0) + 1);
        }
        return count;
    }
}