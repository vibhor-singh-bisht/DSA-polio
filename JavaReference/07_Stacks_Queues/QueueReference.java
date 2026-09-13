import java.util.LinkedList;
import java.util.Queue;

// Queue: FIFO (First In, First Out). Most common implementation is LinkedList.
// offer/poll/peek: O(1). Prefer offer/poll/peek over add/remove/element -
// they return null/false instead of throwing on empty/full queues.
public class QueueReference {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // interface -> implementation

        queue.offer(1); // add to the back (preferred over add())
        queue.offer(2);
        queue.offer(3);

        System.out.println("peek(): " + queue.peek()); // look at front without removing
        System.out.println("poll(): " + queue.poll());  // remove and return front
        System.out.println("after poll: " + queue);
        System.out.println("size(): " + queue.size());
        System.out.println("isEmpty(): " + queue.isEmpty());

        // Draining a queue - common BFS pattern
        while (!queue.isEmpty()) {
            System.out.println("processing: " + queue.poll());
        }

        // add/remove/element throw exceptions instead of returning null/false
        queue.add(100);
        System.out.println("element(): " + queue.element());
        System.out.println("remove(): " + queue.remove());
    }
}
