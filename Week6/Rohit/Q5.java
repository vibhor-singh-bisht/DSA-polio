class Solution {
    public int[] searchRange(int[] nums, int target) {

        int left = findLowerBound(nums, target);
        int right = findUpperBound(nums, target);

        return new int[] { left, right };
    }

    private int findLowerBound(int[] nums, int target) {

        int index = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                // Look in left Array for similar value to find first Occurence
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    private int findUpperBound(int[] nums, int target) {

        int index = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                // Look in right Array for similar value to find Last Occurence
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}