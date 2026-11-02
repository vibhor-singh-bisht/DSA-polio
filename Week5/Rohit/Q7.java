class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // Build the frequency maps for the initial window
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i),
                     map1.getOrDefault(s1.charAt(i), 0) + 1);

            map2.put(s2.charAt(i),
                     map2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        // Check the initial window
        if (map1.equals(map2)) {
            return true;
        }

        int left = 0;

        // Slide the window across s2
        for (int right = s1.length(); right < s2.length(); right++) {

            // Add the new character to the window
            char rightChar = s2.charAt(right);

            map2.put(rightChar,
                     map2.getOrDefault(rightChar, 0) + 1);

            // Remove the leftmost character from the window
            char leftChar = s2.charAt(left);

            map2.put(leftChar, map2.get(leftChar) - 1);

            // Remove the character if its frequency becomes zero
            if (map2.get(leftChar) == 0) {
                map2.remove(leftChar);
            }

            left++;

            // Check whether the current window is a permutation of s1
            if (map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }
}