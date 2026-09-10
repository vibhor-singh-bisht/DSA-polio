package Week2.Vibhor.Thursday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q1GroupAnagrams {
    class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for( int i = 0 ; i < strs.length ; i ++){
                char str[] = strs[i].toCharArray();
                Arrays.sort(str);
                String key = new String(str);
                if(!map.containsKey(key)) {
                    map.put(key,new ArrayList<>());
                }
                map.get(key).add(strs[i]);
        }

        for(List <String> str : map.values()){
            list.add(str);
        }
        return list;

    }
}
    public static void main(String[] args) {

        Q1GroupAnagrams obj = new Q1GroupAnagrams();

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = obj.new Solution().groupAnagrams(strs);

        System.out.println(result);
    }
    
}
