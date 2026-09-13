import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// List: an ORDERED collection that allows DUPLICATES. Program to the interface,
// choose ArrayList or LinkedList as the implementation.
public class ListReference {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // interface -> implementation

        // Adding
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15); // insert at index

        // Reading
        System.out.println("get(0): " + list.get(0));
        System.out.println("size(): " + list.size());
        System.out.println("isEmpty(): " + list.isEmpty());
        System.out.println("contains(20): " + list.contains(20));
        System.out.println("indexOf(20): " + list.indexOf(20));

        // Updating
        list.set(0, 100);
        System.out.println("after set: " + list);

        // Removing
        list.remove(Integer.valueOf(15)); // remove BY VALUE (must box to avoid index overload)
        list.remove(0);                   // remove BY INDEX
        System.out.println("after removes: " + list);

        // Iteration
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Bulk operations
        list.clear();
        System.out.println("after clear, isEmpty: " + list.isEmpty());

        // Choosing an implementation:
        List<Integer> arrayBacked = new ArrayList<>();   // fast random access, default choice
        List<Integer> linkedBacked = new LinkedList<>(); // fast insert/remove at ends
        System.out.println(arrayBacked.getClass().getSimpleName() + " vs " + linkedBacked.getClass().getSimpleName());
    }
}
