package Week2.Vibhor.Wednesday;

import java.util.HashMap;

public class Q2WordPattern {
    class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String [] nums = s.split(" ");
        if(pattern.length() != nums.length) return false;

        for( int i = 0 ; i < pattern.length() ; i++){
            char c = pattern.charAt(i);
           
             if(map.containsKey(c) && (!map.get(c).equals(nums[i])) || (!map.containsKey(c)) && map.values().contains(nums[i])){
                return false;
            }
             else if(!map.containsKey(c)){
                map.put(c,nums[i]);
            }
        }
        
        return true;
    }
}
    public static void main(String[] args) {

        Q2WordPattern obj = new Q2WordPattern();

        String pattern = "abba";
        String s = "dog cat cat dog";

        boolean result = obj.new Solution().wordPattern(pattern, s);

        System.out.println(result);
    }
    
}
