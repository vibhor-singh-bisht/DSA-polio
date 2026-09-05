package Week1.Vibhor.Saturday;

import java.util.HashMap;

public class Q1ValidAnagram {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        HashMap <Character , Integer> map1 = new HashMap<>();
        HashMap <Character , Integer> map2 = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            int j =0;
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),++j);
            }
            else{
                map1.put(s.charAt(i),map1.get(s.charAt(i)) +1);
            }
        }

        for(int k = 0; k < t.length() ; k++){
            int m =0;
            if(!map2.containsKey(t.charAt(k))){
                map2.put(t.charAt(k),++m);
            }
            else{
                map2.put(t.charAt(k),map2.get(t.charAt(k))+1);
            }
        }
        return map1.equals(map2);

    }

    public static void main(String[] args) {

        Q1ValidAnagram solution = new Q1ValidAnagram();

        String s = "anagram";
        String t = "nagaram";

        boolean result = solution.isAnagram(s, t);

        System.out.println(result);
    }

}
    

