// Widening (implicit) vs narrowing (explicit) casting between primitive types.
public class TypeCasting {

    public static void main(String[] args) {
        // Widening: smaller type -> larger type, done automatically, no data loss
        int i = 100;
        long l = i;      // int -> long
        double d = l;    // long -> double
        System.out.println("Widening: " + i + " -> " + l + " -> " + d);

        // Narrowing: larger type -> smaller type, needs explicit cast, may lose data
        double price = 9.99;
        int truncated = (int) price; // decimal part is dropped, not rounded
        System.out.println("Narrowing: " + price + " -> " + truncated);

        long big = 3_000_000_000L;
        int overflowed = (int) big; // overflow, value wraps around
        System.out.println("Narrowing overflow: " + big + " -> " + overflowed);

        // char <-> int casting (useful for char arithmetic in DSA, e.g. c - 'a')
        char c = 'a';
        int code = c;              // implicit widening char -> int
        char back = (char) (code + 1); // explicit narrowing int -> char
        System.out.println("char->int: " + code + ", int->char: " + back);

        // Casting between object types (reference casting) needs inheritance relationship
        Object obj = "hello";
        String str = (String) obj; // downcast, safe here since obj really is a String
        System.out.println("Object cast to String: " + str);
    }
}
