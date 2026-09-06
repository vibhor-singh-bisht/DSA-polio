import java.util.HashMap;

public class MajorityElement {

    public int majEleBrute(int nums[]) { // O(n^2)

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
                if (count > nums.length / 2) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public int majEleBetter(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            int count = frequency.getOrDefault(num, 0) + 1;
            frequency.put(num, count);

            if (count > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }

    public int majEleMoore(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return count > nums.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        MajorityElement obj1 = new MajorityElement();

        int nums[] = { 3, 2, 3 };
        int res = obj1.majEleBrute(nums);
        int res1 = obj1.majEleBetter(nums);
        int res2 = obj1.majEleMoore(nums);
        System.out.println(res2);
    }
}
