import java.util.Collections;
import java.util.PriorityQueue;

// PriorityQueue: a heap-based queue where elements come out in PRIORITY order,
// not insertion order. By default it's a MIN heap (smallest element first).
// offer/poll: O(log n). peek: O(1). NOT sorted internally - only poll() order is guaranteed.
public class PriorityQueueReference {

    public static void main(String[] args) {
        // Min heap - smallest element has highest priority (default natural ordering)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(5);
        minHeap.offer(1);
        minHeap.offer(3);
        System.out.println("minHeap peek(): " + minHeap.peek()); // 1
        System.out.println("minHeap poll(): " + minHeap.poll()); // 1
        System.out.println("minHeap poll(): " + minHeap.poll()); // 3

        // Max heap - largest element has highest priority, via reverseOrder comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(5);
        maxHeap.offer(1);
        maxHeap.offer(3);
        System.out.println("maxHeap peek(): " + maxHeap.peek()); // 5
        System.out.println("maxHeap poll(): " + maxHeap.poll()); // 5

        // Custom comparator - e.g., sort pairs by their second value ascending
        PriorityQueue<int[]> bySecond = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        bySecond.offer(new int[]{1, 9});
        bySecond.offer(new int[]{2, 3});
        System.out.println("smallest by second value: " + bySecond.peek()[1]); // 3

        // Draining a heap gives elements in sorted priority order - "heap sort" pattern
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.offer(4); heap.offer(2); heap.offer(9); heap.offer(1);
        StringBuilder order = new StringBuilder();
        while (!heap.isEmpty()) {
            order.append(heap.poll()).append(' ');
        }
        System.out.println("drained in ascending order: " + order.toString().trim());

        // Common DSA use case: "k largest elements" using a min heap of size k
        System.out.println("size(): " + minHeap.size());
    }
}
