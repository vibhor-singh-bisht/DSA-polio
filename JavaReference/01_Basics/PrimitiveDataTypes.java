// Reference for Java's 8 primitive data types: sizes, ranges, defaults, and literals.
public class PrimitiveDataTypes {

    public static void main(String[] args) {
        // --- Integer types ---
        byte b = 127;                 // 8-bit,  -128 to 127
        short s = 32000;              // 16-bit, -32,768 to 32,767
        int i = 2_000_000_000;        // 32-bit, ~-2.1B to 2.1B (default int type)
        long l = 9_000_000_000L;      // 64-bit, needs 'L' suffix for large literals

        // --- Floating point types ---
        float f = 3.14f;              // 32-bit, needs 'f' suffix
        double d = 3.14159265;        // 64-bit, default floating point type

        // --- Other types ---
        char c = 'A';                 // 16-bit unsigned, single Unicode character
        boolean flag = true;          // true / false only

        System.out.println("byte: " + b + " range [" + Byte.MIN_VALUE + ", " + Byte.MAX_VALUE + "]");
        System.out.println("short: " + s + " range [" + Short.MIN_VALUE + ", " + Short.MAX_VALUE + "]");
        System.out.println("int: " + i + " range [" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + "]");
        System.out.println("long: " + l + " range [" + Long.MIN_VALUE + ", " + Long.MAX_VALUE + "]");
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c + " as int: " + (int) c);
        System.out.println("boolean: " + flag);

        // Default values (only applies to fields, not local variables):
        // int -> 0, double -> 0.0, boolean -> false, char -> '\u0000', object refs -> null

        // Overflow wraps around silently for primitives - watch out in DSA problems!
        int overflow = Integer.MAX_VALUE + 1;
        System.out.println("Overflow example: " + overflow); // prints Integer.MIN_VALUE
    }
}
