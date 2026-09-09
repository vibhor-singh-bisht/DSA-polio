import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char source = s.charAt(i);
            char target = t.charAt(i);

            if (map1.containsKey(source) && map1.get(source) != target)
                return false;
            if (map2.containsKey(target) && map2.get(target) != source)
                return false;

            map1.put(source, target);
            map2.put(target, source);
        }

        return true;
    }

    public static void main(String[] args) {
        IsIsomorphic obj1 = new IsIsomorphic();

        String s = "ega";
        String t = "abb";

        Boolean res = obj1.isIsomorphic(s, t);
        System.out.println(res);

    }

}
