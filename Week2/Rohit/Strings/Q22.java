import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int num : numSet) {
            // Checking if it numSet doesn't contain the previous number, meaning this could be the start of a sequence
            if (!numSet.contains(num - 1)) {
                int length = 1;
                // Start counting the length of the consecutive sequence from this number
                while (numSet.contains(num + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;        
    }
}