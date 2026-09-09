package Week2.Vibhor.Tuesday;

public class Q2Optimised {
    class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int nums[] = new int[26];
        for( char c : magazine.toCharArray()){
            nums[c-'a']++;
        }
        for( char c : ransomNote.toCharArray()){
            nums[c-'a']--;
            if(nums[c-'a'] < 0) return false;
        }
        return true;
    }
}
    public static void main(String[] args) {

        Q2Optimised obj = new Q2Optimised();

        String ransomNote = "aa";
        String magazine = "ab";

        boolean result = obj.new Solution().canConstruct(ransomNote, magazine);

        System.out.println(result);
    }
}
