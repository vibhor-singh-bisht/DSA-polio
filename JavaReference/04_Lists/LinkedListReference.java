import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// LinkedList: doubly-linked list. Implements BOTH List and Deque.
// add/remove at head or tail: O(1). get(index): O(n) - must walk the list.
// Good when you need frequent insert/remove at both ends (stack/queue behavior).
public class LinkedListReference {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.addFirst(0); // O(1)
        list.addLast(3);  // O(1)
        System.out.println("list: " + list);

        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());

        list.removeFirst(); // O(1)
        list.removeLast();  // O(1)
        System.out.println("after removeFirst/Last: " + list);

        // As a List
        List<Integer> asList = list;
        System.out.println("get(0) via List interface: " + asList.get(0));

        // As a Queue (FIFO)
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        System.out.println("queue.poll(): " + queue.poll());

        // As a Deque (double-ended queue / stack)
        Deque<Integer> deque = new LinkedList<>();
        deque.push(1); // add to front, like a stack
        deque.push(2);
        System.out.println("deque.pop(): " + deque.pop());
    }
}
