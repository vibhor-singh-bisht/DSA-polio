public class pivotIndexRedo {
    public static void main(String[] args) {
        pivotIndexRedo sol = new pivotIndexRedo();
        int[] nums = new int[]{-1, -1, -1, -1, -1, 0};
        System.out.println(sol.pivotIndex(nums));
    }


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