import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

// Pattern: using Queue/Deque as a FIFO queue - the backbone of BFS traversal.
// offer/poll: O(1). Common use: BFS on graphs/trees/grids, level-order traversal.
public class QueuePattern {

    public static void main(String[] args) {
        // Simple queue usage
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        while (!queue.isEmpty()) {
            System.out.println("processing: " + queue.poll());
        }

        // BFS pattern sketch on a small adjacency list graph
        int[][] adjacency = {
            {1, 2},   // node 0's neighbors
            {0, 3},   // node 1's neighbors
            {0, 3},   // node 2's neighbors
            {1, 2}    // node 3's neighbors
        };

        boolean[] visited = new boolean[adjacency.length];
        Queue<Integer> bfsQueue = new ArrayDeque<>();
        bfsQueue.offer(0);
        visited[0] = true;

        StringBuilder order = new StringBuilder();
        while (!bfsQueue.isEmpty()) {
            int node = bfsQueue.poll();
            order.append(node).append(' ');
            for (int neighbor : adjacency[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    bfsQueue.offer(neighbor);
                }
            }
        }
        System.out.println("BFS order: " + order.toString().trim());
    }
}
