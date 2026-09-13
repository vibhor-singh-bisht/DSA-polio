// Long: wrapper class for long, used when values may exceed int range (~2.1 billion).
public class LongReference {

    public static void main(String[] args) {
        System.out.println("MAX_VALUE: " + Long.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Long.MIN_VALUE);

        long parsed = Long.parseLong("9000000000");
        System.out.println("parseLong: " + parsed);

        System.out.println("toBinaryString(10L): " + Long.toBinaryString(10L));
        System.out.println("compare(3L, 5L): " + Long.compare(3L, 5L));
        System.out.println("max(3L, 5L): " + Long.max(3L, 5L));
        System.out.println("sum(3L, 5L): " + Long.sum(3L, 5L));

        // Common DSA pitfall: int * int can overflow even when the result should fit in a long
        int a = 100_000;
        int b = 100_000;
        long wrongProduct = a * b;          // overflow happens in int math BEFORE assignment
        long correctProduct = (long) a * b;  // cast one operand to long first
        System.out.println("wrong (overflowed): " + wrongProduct);
        System.out.println("correct: " + correctProduct);
    }
}
