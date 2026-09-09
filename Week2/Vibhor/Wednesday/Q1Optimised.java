package Week2.Vibhor.Wednesday;

import java.util.Arrays;

public class Q1Optimised {
    class Solution {
    public boolean isIsomorphic(String s, String t) {

  

        int [] st = new int[256];
        int [] ts = new int[256];
        Arrays.fill(st,-1);
        Arrays.fill(ts,-1);

        for( int i = 0 ; i < s.length(); i ++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(st[ss] == -1  && ts[tt] == -1){
                st[ss] = tt;
                ts[tt] = ss;
            }
            else if(st[ss] != tt && ts[tt] != ss) return false;
        }
        return true;
    }

}

    public static void main(String[] args) {

        Q1Optimised obj = new Q1Optimised();

        String s = "egg";
        String t = "add";

        boolean result = obj.new Solution().isIsomorphic(s, t);

        System.out.println(result);
    }
    
}
