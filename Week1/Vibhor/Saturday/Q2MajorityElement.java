package Week1.Vibhor.Saturday;

public class Q2MajorityElement {
    class Solution {
    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) count++;
            }
                if (count > nums.length / 2) return nums[i];
        }

        return nums[0];
    }
}
    public static void main(String[] args) {

        Q2MajorityElement solution = new Q2MajorityElement();
        Solution obj = solution.new Solution();

        int[] nums = {3, 2, 3};

        int result = obj.majorityElement(nums);

        System.out.println(result);
    }
    
}
