import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Iterator<T>: object used to traverse a collection one element at a time.
// ListIterator adds backward traversal and in-place modification for Lists.
public class IteratorReference {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // Basic iteration
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int value = it.next();
            System.out.print(value + " ");
        }
        System.out.println();

        // Safe removal DURING iteration - use Iterator.remove(), NOT list.remove()
        // (modifying a list directly while iterating throws ConcurrentModificationException)
        Iterator<Integer> removingIt = list.iterator();
        while (removingIt.hasNext()) {
            int value = removingIt.next();
            if (value % 2 == 0) {
                removingIt.remove();
            }
        }
        System.out.println("after removing evens: " + list);

        // ListIterator - supports traversal in both directions and set()
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3));
        ListIterator<Integer> listIt = nums.listIterator();
        while (listIt.hasNext()) {
            int value = listIt.next();
            listIt.set(value * 10); // replace current element
        }
        System.out.println("after ListIterator set: " + nums);

        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
        System.out.println();
    }
}
