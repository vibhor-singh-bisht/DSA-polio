import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];

        for(int num:nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((e1,e2) -> map.get(e1) - map.get(e2));

        for(int n: map.keySet()){
            heap.add(n);

            if(heap.size() > k){
                heap.poll();
            }
        }
        for(int i =0;i<k;i++){
            result[i] = heap.poll();
        }
        return result;
    }
}