import java.math.BigDecimal;
import java.math.RoundingMode;

// BigDecimal: exact decimal arithmetic, avoids the rounding errors of double/float.
// Immutable - every operation returns a NEW BigDecimal. Use for money/precision-sensitive math.
public class BigDecimalReference {

    public static void main(String[] args) {
        // Why BigDecimal? double loses precision:
        System.out.println("0.1 + 0.2 as double: " + (0.1 + 0.2)); // 0.30000000000000004

        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        System.out.println("0.1 + 0.2 as BigDecimal: " + a.add(b)); // exact 0.3

        BigDecimal x = new BigDecimal("10.5");
        BigDecimal y = new BigDecimal("3");

        System.out.println("add: " + x.add(y));
        System.out.println("subtract: " + x.subtract(y));
        System.out.println("multiply: " + x.multiply(y));

        // Division needs a scale + rounding mode, since results may be non-terminating
        BigDecimal divided = x.divide(y, 2, RoundingMode.HALF_UP);
        System.out.println("divide (2 decimal places): " + divided);

        // setScale - control number of decimal places explicitly
        System.out.println("setScale(1): " + x.setScale(1, RoundingMode.HALF_UP));

        // compareTo - use this instead of equals() (equals() also checks scale, e.g. 1.0 != 1.00)
        BigDecimal p = new BigDecimal("1.0");
        BigDecimal q = new BigDecimal("1.00");
        System.out.println("equals: " + p.equals(q));       // false - different scale
        System.out.println("compareTo == 0: " + (p.compareTo(q) == 0)); // true - same value
    }
}
