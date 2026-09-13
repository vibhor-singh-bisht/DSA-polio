// Wrapper classes box primitives into objects so they can be used with collections/generics.
public class WrapperClasses {

    public static void main(String[] args) {
        // Every primitive has a wrapper: int->Integer, long->Long, double->Double,
        // char->Character, boolean->Boolean, byte->Byte, short->Short, float->Float

        // Autoboxing: primitive -> wrapper automatically
        Integer boxed = 10;
        // Unboxing: wrapper -> primitive automatically
        int unboxed = boxed;

        // Parsing strings to primitives/wrappers (very common in LeetCode input parsing)
        int parsed = Integer.parseInt("123");
        double parsedD = Double.parseDouble("3.14");
        Integer valueOf = Integer.valueOf("456"); // returns Integer object, may use cache

        // Useful constants
        System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE + " " + Long.MIN_VALUE);

        // Comparing wrapper objects
        Integer a = 200, b = 200;
        System.out.println("a == b: " + (a == b));           // false, outside -128..127 cache
        System.out.println("a.equals(b): " + a.equals(b));   // true, use equals() to compare values
        System.out.println("Integer.compare: " + Integer.compare(a, b));

        // Common conversions
        System.out.println(Integer.toBinaryString(10));  // "1010"
        System.out.println(Integer.toString(255, 16));   // "ff" (base 16)
        System.out.println(String.valueOf(42));           // "42"

        // Character helpers, handy for string/char DSA problems
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toLowerCase('A'));

        System.out.println("parsed=" + parsed + " parsedD=" + parsedD + " valueOf=" + valueOf);
        System.out.println("unboxed=" + unboxed);
    }
}
