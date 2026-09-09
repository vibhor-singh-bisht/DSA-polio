import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();

        String [] arr = s.split(" ");

        if(pattern.length() != arr.length) return false;

        for(int i= 0;i<arr.length;i++){

        char a = pattern.charAt(i);
        String b = arr[i];

        if(map1.containsKey(a) && !map1.get(a).equals(arr[i])) return false;

        if(map2.containsKey(b) && map2.get(b) != a) return false;
        map1.put(a,b);
        map2.put(b,a);
        }

        return true;
    }
}