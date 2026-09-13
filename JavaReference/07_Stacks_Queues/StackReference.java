import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// java.util.Stack is a legacy class (extends Vector, synchronized -> slower).
// Modern Java code prefers using a Deque as a stack instead (see push/pop below).
// LIFO: Last In, First Out. push/pop/peek: O(1).
public class StackReference {

    public static void main(String[] args) {
        // Legacy Stack class
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("peek(): " + stack.peek()); // look at top without removing
        System.out.println("pop(): " + stack.pop());   // remove and return top
        System.out.println("after pop: " + stack);
        System.out.println("isEmpty(): " + stack.isEmpty());
        System.out.println("search(1): " + stack.search(1)); // 1-based distance from top

        // Preferred modern approach: Deque as a stack
        Deque<Integer> modernStack = new ArrayDeque<>();
        modernStack.push(10);
        modernStack.push(20);
        System.out.println("Deque as stack, pop(): " + modernStack.pop());

        // Classic DSA use case: balanced parentheses check
        String expr = "{[()]}";
        Deque<Character> checker = new ArrayDeque<>();
        boolean balanced = true;
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                checker.push(c);
            } else {
                if (checker.isEmpty()) { balanced = false; break; }
                char open = checker.pop();
                if ((c == ')' && open != '(') || (c == ']' && open != '[') || (c == '}' && open != '{')) {
                    balanced = false;
                    break;
                }
            }
        }
        System.out.println("balanced: " + (balanced && checker.isEmpty()));
    }
}
