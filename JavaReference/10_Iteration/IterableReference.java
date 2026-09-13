import java.util.Iterator;
import java.util.NoSuchElementException;

// Iterable<T>: the interface behind Java's enhanced for-each loop.
// Any class implementing Iterable can be used in a "for (T item : myObject)" loop.
public class IterableReference {

    // A simple custom range class that is Iterable, to demonstrate the mechanism.
    static class Range implements Iterable<Integer> {
        private final int start, end;

        Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                private int current = start;

                @Override
                public boolean hasNext() {
                    return current < end;
                }

                @Override
                public Integer next() {
                    if (!hasNext()) throw new NoSuchElementException();
                    return current++;
                }
            };
        }
    }

    public static void main(String[] args) {
        Range range = new Range(1, 5);

        // The for-each loop below is just sugar for calling iterator()/hasNext()/next()
        for (int value : range) {
            System.out.print(value + " ");
        }
        System.out.println();

        // All standard collections (List, Set, Map.values(), etc.) implement Iterable,
        // which is why they all work with for-each loops.
    }
}
