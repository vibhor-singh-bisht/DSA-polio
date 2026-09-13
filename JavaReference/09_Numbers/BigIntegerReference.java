import java.math.BigInteger;

// BigInteger: arbitrary-precision integers, for values too large for long.
// Immutable - every operation returns a NEW BigInteger.
public class BigIntegerReference {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("123456789012345678901234567890");
        BigInteger b = BigInteger.valueOf(1000);

        System.out.println("add: " + a.add(b));
        System.out.println("subtract: " + a.subtract(b));
        System.out.println("multiply: " + a.multiply(b));
        System.out.println("divide: " + a.divide(b));
        System.out.println("mod: " + a.mod(b));
        System.out.println("pow(2): " + b.pow(2));

        System.out.println("compareTo: " + a.compareTo(b)); // >0 means a > b

        // Constants
        System.out.println("ZERO: " + BigInteger.ZERO);
        System.out.println("ONE: " + BigInteger.ONE);
        System.out.println("TEN: " + BigInteger.TEN);

        // Common DSA use case: factorial of large numbers that overflow long
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= 20; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("20! = " + factorial);
    }
}
