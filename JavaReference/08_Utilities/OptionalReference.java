import java.util.Optional;

// Optional<T>: a container that may or may not hold a non-null value.
// Helps avoid NullPointerExceptions by making "possibly absent" explicit in the type.
public class OptionalReference {

    public static void main(String[] args) {
        Optional<String> present = Optional.of("hello");     // value must NOT be null
        Optional<String> maybeNull = Optional.ofNullable(null); // safely wraps a possibly-null value
        Optional<String> empty = Optional.empty();

        System.out.println("isPresent(): " + present.isPresent());
        System.out.println("isEmpty(): " + maybeNull.isEmpty());

        System.out.println("get(): " + present.get()); // throws if empty - check isPresent first

        System.out.println("orElse default: " + maybeNull.orElse("default value"));
        System.out.println("orElseGet: " + empty.orElseGet(() -> "computed default"));

        // map - transform the value if present, no-op if empty
        Optional<Integer> length = present.map(String::length);
        System.out.println("map to length: " + length.get());

        // ifPresent - run code only if a value exists
        present.ifPresent(v -> System.out.println("value exists: " + v));

        // Common use: methods that might not find a result (e.g. find first match)
        Optional<Integer> firstEven = java.util.stream.Stream.of(1, 3, 5, 6, 7)
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println("firstEven: " + firstEven.orElse(-1));
    }
}
