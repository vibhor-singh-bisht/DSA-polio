import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);
            // "Get the list for this key; if there isn't one, create it; then add the value to that list."
            map.computeIfAbsent(key, k -> new ArrayList<>())
               .add(str);
        }

        return new ArrayList<>(map.values());
    }
}