import java.util.ArrayDeque;

// ArrayDeque: resizable array based Deque implementation. No capacity restrictions,
// null elements are NOT allowed. Faster than Stack and LinkedList for stack/queue use.
// addFirst/addLast/pollFirst/pollLast: amortized O(1).
public class ArrayDequeReference {

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(3);
        System.out.println("deque: " + deque); // [1, 2, 3]

        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());

        deque.removeFirst();
        deque.removeLast();
        System.out.println("after removeFirst/Last: " + deque);

        // As a stack (LIFO)
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack top via peek(): " + stack.peek());
        System.out.println("stack pop(): " + stack.pop());

        // As a queue (FIFO)
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        System.out.println("queue poll(): " + queue.poll());

        // null is not allowed
        try {
            deque.add(null);
        } catch (NullPointerException e) {
            System.out.println("Caught NPE: ArrayDeque disallows null elements");
        }
    }
}
