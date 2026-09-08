import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return false;

        Map<Character,Integer> map = new HashMap<>();

        for(char c: ransomNote.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int required = ransomNote.length();
         // Use characters from magazine
        for (char c : magazine.toCharArray()) {

            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
                required--;

                if (required == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}