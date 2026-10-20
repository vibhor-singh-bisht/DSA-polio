//import java.util.Stack;
//
//public class ValidParentheses {
//
//    public static void main(String[] args) {
//
//        Solution solution = new Solution();
//
//        String s = "()";
//
//        boolean result = solution.isValid(s);
//
//        System.out.println("Input: " + s);
//        System.out.println("Result: " + result);
//    }
//}
//
//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> st = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
//                st.push(s.charAt(i));
//            }
//            else if (s.charAt(i) == ']' && !st.isEmpty() && st.peek() == '[') {
//                try {
//                    st.pop();
//                } catch (Exception e) {
//                    return false;
//                }
//            }
//            else if (s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{') {
//                try {
//                    st.pop();
//                } catch (Exception e) {
//                    return false;
//                }
//            }
//            else if (s.charAt(i) == ')' && s.char st.peek() == '(') {
//                try {
//                    st.pop();
//                } catch (Exception e) {
//                    return false;
//                }
//            }
//            else return false;
//        }
//
//        if (st.isEmpty()) return true;
//        return false;
//    }
//}
