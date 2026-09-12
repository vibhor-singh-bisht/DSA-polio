package Week2.Vibhor.Saturday;

public class Q2LongestConsecuivePrefix {
    class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        for(int i = 0 ; i < strs[0].length() ; i++){
            char ch = strs[0].charAt(i);
            boolean isSame = true;

            for(int j = 1; j < strs.length;j++){
                if(strs[j].length() <= i ||strs[j].charAt(i) != ch ){
                    isSame = false;
                    break;
                }
            }
            if(isSame == false) break;
            else ans+=ch;
        }
        return ans;
    }
}
    public static void main(String[] args) {
        Solution sol = new Q2LongestConsecuivePrefix().new Solution();
        String[] strs = {"flower","flow","flight"};
        System.out.println(sol.longestCommonPrefix(strs));
    }
}
