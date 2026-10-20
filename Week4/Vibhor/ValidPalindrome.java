import java.util.stream.Collectors;
class Solution {
    public boolean isPalindrome(String str) {

        String s = str.toLowerCase().chars().
        filter(c -> Character.isLetterOrDigit(c)).
        mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());

        
        int st = 0;
        int end = s.length() - 1;
        while(st<end){
            if(s.charAt(st) != s.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
        
    }
}
public class ValidPalindrome{
    public static void main(String[] args) {
        Solution solution = new Solution();
        String testString = "A man a plan a canal Panama";
        System.out.println(solution.isPalindrome(testString)); // Output: true
    }
}
