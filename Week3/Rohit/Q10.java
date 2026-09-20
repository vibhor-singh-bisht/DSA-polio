package Week3.Rohit;

class Solution {

    public int numberOfSubarrays(int[] nums, int k) {

        // Number of subarrays with exactly k odd numbers
        // = atMost(k) - atMost(k - 1)
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {

        if (k < 0) {
            return 0;
        }

        int left = 0;
        int oddCount = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            // Odd number contributes 1, even number contributes 0
            oddCount += nums[right] % 2 == 1 ? 1 : 0;

            while (oddCount > k) {
                oddCount -= nums[left] % 2 == 1 ? 1 : 0;
                left++;
            }

            // All subarrays ending at right from left to right
            // have at most k odd numbers
            count += right - left + 1;
        }

        return count;
    }
}