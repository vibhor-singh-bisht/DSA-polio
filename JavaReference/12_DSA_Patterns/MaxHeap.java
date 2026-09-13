import java.util.PriorityQueue;
import java.util.Collections;

// Pattern: Max Heap via PriorityQueue + reverseOrder comparator - largest element on top.
// offer/poll: O(log n). Common use: "k largest elements", scheduling by highest priority.
public class MaxHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int[] nums = {9, 4, 7, 1, 3};
        for (int n : nums) {
            maxHeap.offer(n);
        }

        System.out.println("largest element: " + maxHeap.peek());

        // Example: find the k largest elements by polling k times
        int k = 3;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            result.append(maxHeap.poll()).append(' ');
        }
        System.out.println(k + " largest elements: " + result.toString().trim());
    }
}
