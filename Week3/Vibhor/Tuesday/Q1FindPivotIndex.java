package Week3.Vibhor.Tuesday;

public class Q1FindPivotIndex {
    class Solution {
public int pivotIndex(int[] nums) {

    int totalSum = 0;

    for (int num : nums) {
        totalSum += num;
    }

    int leftSum = 0;

    for (int i = 0; i < nums.length; i++) {

        int rightSum = totalSum - leftSum - nums[i];

        if (leftSum == rightSum) {
            return i;
        }

        leftSum += nums[i];
    }

    return -1;
}
}
    public static void main(String[] args) {
        Solution sol = new Q1FindPivotIndex().new Solution();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = sol.pivotIndex(nums);
        System.out.println(result);
    }
    
}
