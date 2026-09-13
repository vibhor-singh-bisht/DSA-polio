import java.util.HashMap;
import java.util.Map;

// Pattern: count occurrences of each element using a HashMap. O(n) time, O(n) space.
// Common in: anagrams, majority element, top-k frequent elements, etc.
public class FrequencyMap {

    static Map<Character, Integer> countCharacters(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String s = "abracadabra";
        Map<Character, Integer> freq = countCharacters(s);
        System.out.println("frequency map: " + freq);

        char mostFrequent = ' ';
        int max = 0;
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                mostFrequent = e.getKey();
            }
        }
        System.out.println("most frequent char: '" + mostFrequent + "' (" + max + " times)");
    }
}
