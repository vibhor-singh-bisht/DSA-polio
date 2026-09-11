import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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

        for (int i : orderedCount.keySet()) {
            res[res.length - (k--)] = i;
            if (k == 0) {
                break;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        TopKFrequents obj1 = new TopKFrequents();

        int[] nums = { 5,5,5,5, 2, 2, 3, 4, 4, 4, 4, 4,1,1,1, 6 };
        int k = 2;

        int[] resHashmap = obj1.topKFrequentsHashmap(nums, k);
        System.out.println(Arrays.toString(resHashmap));
    }
}
