package Week2.Vibhor.Thursday;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class Q2TopKFrequentElements {
 class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        Map<Integer,Integer> linkedMap = new LinkedHashMap<>();

        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> linkedMap.put(x.getKey(),x.getValue()));

        int [] ar = new int[k];

        for( int x : linkedMap.keySet() ){  
            ar[--k] = x;
            if( k == 0) break;
        }
        return ar;
       
        
    }
    public static void main(String[] args) {
        Q2TopKFrequentElements q2 = new Q2TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = q2.new Solution().topKFrequent(nums, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}      

    
}
