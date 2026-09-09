import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");

        if (arr.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char pat = pattern.charAt(i);
            String word = arr[i];

            if ((map.containsKey(pat)) && !map.get(pat).equals(word)
                    || (!map.containsKey(pat) && map.values().contains(word))) {
                return false;
            }
            map.put(pat, word);
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern obj1 = new WordPattern();

        String pat = "abba";
        String s = "dog cat ca dog";

        boolean res = obj1.wordPattern(pat, s);
        System.out.println(res);
    }

}
