// java.lang.Math: static helper methods for numeric operations. Always available, no import needed.
public class MathReference {

    public static void main(String[] args) {
        System.out.println("max(3, 7): " + Math.max(3, 7));
        System.out.println("min(3, 7): " + Math.min(3, 7));
        System.out.println("abs(-5): " + Math.abs(-5));
        System.out.println("pow(2, 10): " + Math.pow(2, 10)); // returns double
        System.out.println("sqrt(16): " + Math.sqrt(16));
        System.out.println("floor(3.7): " + Math.floor(3.7)); // rounds down -> 3.0
        System.out.println("ceil(3.2): " + Math.ceil(3.2));   // rounds up -> 4.0
        System.out.println("round(3.5): " + Math.round(3.5)); // rounds to nearest long -> 4

        // Useful constants
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);

        // Common DSA helpers
        System.out.println("log(x)/log(2) for log2: " + (Math.log(8) / Math.log(2)));
        System.out.println("Math.floorMod(-1, 5): " + Math.floorMod(-1, 5)); // always non-negative result
        System.out.println("-1 % 5 (regular %): " + (-1 % 5)); // can be negative, unlike floorMod
    }
}
