class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        // Slide the window
        for (int j = k; j < nums.length; j++) {
            sum = sum - nums[j - k] + nums[j];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}