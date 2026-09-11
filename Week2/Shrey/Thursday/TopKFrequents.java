import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequents {

    public int[] topKFrequentsHashmap(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);

        }

        Map<Integer, Integer> orderedCount = new LinkedHashMap<>();

        count.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> orderedCount.put(x.getKey(), x.getValue()));

        // count.entrySet()
        // .stream()
        // .sorted(
        // Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder())
        // .thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder())))
        // .forEachOrdered(x -> orderedCount.put(x.getKey(), x.getValue()));

        for (int i : orderedCount.keySet()) {
            res[res.length - (k--)] = i;
            if (k == 0) {
                break;
            }
        }
        return res;
    }

    public int[] topKFrequentsHeap(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);

        }

        // Queue m FIFO hota hai, jo pehle gya wo pehle niklega
        // priority queue m jiski priority pehle hoti hai wo nikalta hai
        // aur hum priority set kr sakte hai
        // aur hum set krenge ki Jiska Kam count hai map ke andar wo pehle nikal jaaye
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> count.get(a) - count.get(b)); // asc order m priority

        for (int key : count.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        while (k-- > 0) {
            res[k] = minHeap.poll();
        }

        return res;

    }

    public static void main(String[] args) {
        TopKFrequents obj1 = new TopKFrequents();

        int[] nums = { 5, 5, 5, 5, 2, 2, 3, 4, 4, 4, 4, 4, 1, 1, 1, 1, 6 };
        int k = 2;

        int[] resHashmap = obj1.topKFrequentsHashmap(nums, k);
        int[] resHeap = obj1.topKFrequentsHeap(nums, k);
        System.out.println(Arrays.toString(resHeap));
    }
}
