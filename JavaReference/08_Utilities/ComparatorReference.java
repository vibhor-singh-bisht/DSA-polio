import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Comparator: defines a custom ordering for objects, used by sort(), TreeMap, PriorityQueue, etc.
public class ComparatorReference {

    record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 2, 8, 1, 9));

        // Ascending - natural order (no comparator needed, or Comparator.naturalOrder())
        nums.sort(Comparator.naturalOrder());
        System.out.println("ascending: " + nums);

        // Descending
        nums.sort(Comparator.reverseOrder());
        System.out.println("descending: " + nums);

        // Sorting objects by a specific field, using a lambda
        List<Person> people = new ArrayList<>(List.of(
            new Person("Charlie", 35),
            new Person("Alice", 25),
            new Person("Bob", 30)
        ));

        people.sort((p1, p2) -> p1.age() - p2.age()); // ascending by age, lambda syntax
        System.out.println("sorted by age (lambda): " + people);

        // Same thing using Comparator.comparing (more readable, preferred style)
        people.sort(Comparator.comparing(Person::name));
        System.out.println("sorted by name: " + people);

        // Descending by field
        people.sort(Comparator.comparing(Person::age).reversed());
        System.out.println("sorted by age desc: " + people);

        // Multi-level sort: by age, then by name if ages are equal
        people.sort(Comparator.comparing(Person::age).thenComparing(Person::name));
        System.out.println("sorted by age then name: " + people);

        // Sorting a 2D array by a specific column/index (very common in DSA - "intervals")
        int[][] intervals = {{3, 4}, {1, 2}, {2, 6}};
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // sort by first element ascending
        System.out.println("sorted intervals by start: " + Arrays.deepToString(intervals));

        // Sorting by second column descending
        Arrays.sort(intervals, (a, b) -> b[1] - a[1]);
        System.out.println("sorted intervals by end desc: " + Arrays.deepToString(intervals));
    }
}
