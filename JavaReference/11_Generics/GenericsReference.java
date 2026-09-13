import java.util.ArrayList;
import java.util.List;

// Generics: let classes/methods operate on typed parameters, checked at compile time.
public class GenericsReference {

    // Generic class - Box<T> can hold any type, decided when it's instantiated
    static class Box<T> {
        private T value;

        void set(T value) { this.value = value; }
        T get() { return value; }
    }

    // Generic method - <T> is declared before the return type
    static <T> T firstElement(List<T> list) {
        return list.get(0);
    }

    // Bounded type parameter - T must extend Comparable to be usable with compareTo
    static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }

    // Wildcard - accepts a List of ANY type, when you only need to read from it
    static void printAll(List<?> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("hello");
        System.out.println("Box<String>: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Box<Integer>: " + intBox.get());

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3));
        System.out.println("firstElement: " + firstElement(nums));

        System.out.println("max(3, 7): " + max(3, 7));
        System.out.println("max(\"apple\", \"banana\"): " + max("apple", "banana"));

        printAll(nums);
        printAll(List.of("a", "b", "c"));
    }
}
