import java.util.HashSet;
import java.util.Set;

// Set: a collection with NO DUPLICATES. Choose HashSet, LinkedHashSet, or TreeSet
// depending on whether you need ordering.
public class SetReference {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // interface -> implementation

        set.add(1);
        set.add(2);
        set.add(2); // duplicate ignored
        set.add(3);

        System.out.println("set: " + set);
        System.out.println("size(): " + set.size());
        System.out.println("contains(2): " + set.contains(2));
        System.out.println("isEmpty(): " + set.isEmpty());

        set.remove(2);
        System.out.println("after remove(2): " + set);

        for (int value : set) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Set algebra using addAll/retainAll/removeAll
        Set<Integer> a = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> b = new HashSet<>(Set.of(2, 3, 4));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("union: " + union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("intersection: " + intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("difference (a-b): " + difference);

        set.clear();
        System.out.println("after clear, isEmpty: " + set.isEmpty());
    }
}
