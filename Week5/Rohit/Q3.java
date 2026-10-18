class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        int low = 0;
        int hi = 0;

        while (hi < nums.length) {
            sum += nums[hi];
            hi++;

            // Trying to shrink the window
            while (sum >= target) {

                int currLen = hi - low;
                // Updating min Window length
                minLen = Math.min(currLen, minLen);

                sum = sum - nums[low];
                low++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;

    }
}