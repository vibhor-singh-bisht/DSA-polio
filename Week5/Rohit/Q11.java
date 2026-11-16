
class Solution {
    public String minWindow(String s, String t) {

        int n = s.length();
        int m = t.length();

        // Store the frequency of each character in t
        int[] need = new int[128];

        // Store the frequency of characters in the current window
        int[] window = new int[128];

        for (char ch : t.toCharArray()) {
            need[ch]++;
        }

        // Two pointers to maintain the sliding window
        int left = 0;
        int matched = 0;

        // Variables to store the minimum window
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;

        // Expand the window using the right pointer
        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);

            // Include the current character in the window
            window[ch]++;

            // Increase matched only if the character is required
            // and its frequency does not exceed the required frequency
            if (need[ch] > 0 && window[ch] <= need[ch]) {
                matched++;
            }

            // When all required characters are matched,
            // try shrinking the window from the left
            while (matched == m) {

                // Calculate the current window length
                int currentLength = right - left + 1;

                // Update the minimum window if a smaller one is found
                if (currentLength < minLength) {
                    minLength = currentLength;
                    startIndex = left;
                }

                // Remove the leftmost character from the window
                char leftChar = s.charAt(left);
                window[leftChar]--;

                // If removing this character makes its frequency
                // smaller than required, the window becomes invalid
                if (need[leftChar] > 0 &&
                    window[leftChar] < need[leftChar]) {

                    matched--;
                }

                // Move the left pointer forward
                left++;
            }
        }

        // Return the minimum window if found, otherwise return empty string
        return startIndex == -1 ? "" :
               s.substring(startIndex, startIndex + minLength);
    }
}
