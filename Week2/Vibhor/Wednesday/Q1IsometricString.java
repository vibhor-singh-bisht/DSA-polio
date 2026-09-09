package Week2.Vibhor.Wednesday;

import java.util.HashMap;

public class Q1IsometricString {
    class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();

        for( int i = 0; i < s.length() ;i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);


            if(map.containsKey(ss) && tt != map.get(ss) || (!map.containsKey(ss) && map.values().contains(tt)) ) {
                return false; 
            }
                map.put(ss,tt);
        }
        return true;
    }

}   
    public static void main(String[] args) {

        Q1IsometricString obj = new Q1IsometricString();

        String s = "egg";
        String t = "add";

        boolean result = obj.new Solution().isIsomorphic(s, t);

        System.out.println(result);
    }
    
}
