import java.util.PriorityQueue;

// Pattern: Min Heap via PriorityQueue - smallest element always at the top.
// offer/poll: O(log n). Common use: "k smallest elements", Dijkstra, merge k sorted lists.
public class MinHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int[] nums = {9, 4, 7, 1, 3};
        for (int n : nums) {
            minHeap.offer(n);
        }

        System.out.println("smallest element: " + minHeap.peek());

        // Example: find the k smallest elements by polling k times
        int k = 3;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k && !minHeap.isEmpty(); i++) {
            result.append(minHeap.poll()).append(' ');
        }
        System.out.println(k + " smallest elements: " + result.toString().trim());
    }
}
