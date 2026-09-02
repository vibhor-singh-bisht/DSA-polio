import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class IntersectionOfArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i] = num;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        IntersectionOfArrays obj1 = new IntersectionOfArrays();

        int[] nums1 = { 1, 2, 3, 2 };
        int[] nums2 = { 2, 3, 4, 5, 6 };

        int[] res = obj1.intersection(nums1, nums2);
        System.out.println("Intersection of arrays: " + Arrays.toString(res));
    }
}
