import java.util.ArrayDeque;
import java.util.Deque;

// Deque (Double Ended Queue): insert/remove from BOTH ends. Can act as a stack OR a queue.
// ArrayDeque is the preferred general-purpose implementation - faster than Stack/LinkedList.
// All operations below are O(1).
public class DequeReference {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(); // interface -> implementation

        // Add
        deque.addFirst(1); // [1]
        deque.addLast(2);  // [1, 2]
        deque.offerFirst(0); // [0, 1, 2]
        deque.offerLast(3);  // [0, 1, 2, 3]
        System.out.println("deque: " + deque);

        // Peek (no removal)
        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());

        // Remove
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("after polls: " + deque);

        // Stack-style usage (LIFO): push/pop operate on the FRONT of the deque
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        System.out.println("stack pop(): " + stack.pop());

        // Queue-style usage (FIFO): offer at the back, poll from the front
        Deque<Integer> fifo = new ArrayDeque<>();
        fifo.offer(1);
        fifo.offer(2);
        System.out.println("fifo poll(): " + fifo.poll());

        // Common DSA use case: sliding window maximum uses a Deque of indices
        System.out.println("isEmpty(): " + deque.isEmpty());
    }
}
