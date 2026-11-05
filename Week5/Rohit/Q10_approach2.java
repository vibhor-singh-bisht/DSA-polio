
class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroes = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            // Expand the window
            if (nums[right] == 0) {
                zeroes++;
            }

            // Shrink the window until it becomes valid
            while (zeroes > k) {
                if (nums[left] == 0) {
                    zeroes--;
                }
                left++;
            }

            // Update maximum window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
