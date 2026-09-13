import java.util.Deque;
import java.util.ArrayDeque;

// Pattern: using a Deque as a Stack (LIFO). Prefer this over java.util.Stack.
// push/pop/peek: O(1). Common use: parentheses matching, monotonic stack, DFS.
public class StackPattern {

    static boolean isValidParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((c == ')' && open != '(') || (c == ']' && open != '[') || (c == '}' && open != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("\"{[()]}\" valid: " + isValidParentheses("{[()]}"));
        System.out.println("\"([)]\" valid: " + isValidParentheses("([)]"));

        // Monotonic stack pattern sketch - keep stack elements in increasing order
        Deque<Integer> monoStack = new ArrayDeque<>();
        int[] nums = {2, 1, 5, 6, 2, 3};
        for (int n : nums) {
            while (!monoStack.isEmpty() && monoStack.peek() > n) {
                monoStack.pop(); // pop elements that break the increasing order
            }
            monoStack.push(n);
        }
        System.out.println("final monotonic stack: " + monoStack);
    }
}
