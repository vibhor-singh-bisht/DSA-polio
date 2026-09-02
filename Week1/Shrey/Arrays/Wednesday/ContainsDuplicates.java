import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    // Brute Force approach
    public boolean containsDuplicatesBrute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Sort the array and compare present element with next element, only 1 loop
    public boolean containsDuplicatesSort(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // Using Hashset
    public boolean HashSetApproach(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicates obj1 = new ContainsDuplicates();
        int[] nums = { 1, 2, 4, 5 };

        // boolean bruteRes = brute.containsDuplicatesBrute(nums);
        boolean SortRes = obj1.containsDuplicatesSort(nums);
        // System.out.println("Result of Brute : " + bruteRes);
        System.out.println("Result of Sort : " + SortRes);
    }
}
