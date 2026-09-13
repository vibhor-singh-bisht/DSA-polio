// Java arrays are fixed-size, zero-indexed, and store elements of a single type.
public class ArrayReference {

    public static void main(String[] args) {
        // Declaration + initialization
        int[] a = new int[5];           // all elements default to 0
        int[] b = {1, 2, 3, 4, 5};      // array literal
        int[] c = new int[]{10, 20, 30};

        System.out.println("length: " + b.length); // length is a field, not a method

        // Access and modify
        a[0] = 100;
        System.out.println("a[0]: " + a[0]);

        // Iteration - classic for loop (index needed)
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        // Iteration - enhanced for-each (no index, read-only)
        for (int value : c) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Arrays of objects default to null
        String[] names = new String[3];
        System.out.println("default object element: " + names[0]);

        // Common pitfall: array index out of bounds throws at runtime
        try {
            int oops = b[10];
            System.out.println(oops);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // Arrays are objects - assigning copies the reference, not the data
        int[] ref = b;
        ref[0] = 999;
        System.out.println("b[0] also changed: " + b[0]); // true copy needs Arrays.copyOf/clone
    }
}
