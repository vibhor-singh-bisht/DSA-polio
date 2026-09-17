package Week3.Rohit;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int [] prefixSum = new int[nums.length];

        TreeMap<Integer,Integer> map = new TreeMap<>();

        prefixSum[0] = nums[0];
        map.put(prefixSum[0],0);

        for(int i=1;i<nums.length;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
            map.put(prefixSum[i], i);
        }

        int [] ans = new int[queries.length];
        int i =0;
        for(int query: queries){
            // This floorEntry() provides value which is the greatest key less than or equal to the query
            Map.Entry<Integer,Integer> entry = map.floorEntry(query);

            if(entry != null){
                ans[i] = entry.getValue() + 1;
            }

            i++;
        }

        return ans;
    }
}

