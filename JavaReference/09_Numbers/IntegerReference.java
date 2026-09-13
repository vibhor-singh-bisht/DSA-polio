// Integer: wrapper class for int, plus useful static utility methods.
public class IntegerReference {

    public static void main(String[] args) {
        System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);

        System.out.println("parseInt: " + Integer.parseInt("123"));
        System.out.println("valueOf: " + Integer.valueOf("456"));

        System.out.println("toString(255, 16): " + Integer.toString(255, 16)); // "ff"
        System.out.println("toBinaryString(10): " + Integer.toBinaryString(10));
        System.out.println("toHexString(255): " + Integer.toHexString(255));
        System.out.println("toOctalString(8): " + Integer.toOctalString(8));

        System.out.println("compare(3, 5): " + Integer.compare(3, 5)); // negative -> a < b
        System.out.println("max(3, 5): " + Integer.max(3, 5));
        System.out.println("min(3, 5): " + Integer.min(3, 5));
        System.out.println("sum(3, 5): " + Integer.sum(3, 5));

        // bitCount - number of 1 bits, handy for bitmask DSA problems
        System.out.println("bitCount(7): " + Integer.bitCount(7)); // 111 -> 3

        // Overflow-safe checks
        try {
            Math.addExact(Integer.MAX_VALUE, 1);
        } catch (ArithmeticException e) {
            System.out.println("Caught overflow: " + e.getMessage());
        }
    }
}
