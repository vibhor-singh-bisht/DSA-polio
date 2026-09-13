// Overview of Java operators commonly used in DSA problems.
public class Operators {

    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic
        System.out.println("a+b=" + (a + b) + " a-b=" + (a - b) + " a*b=" + (a * b));
        System.out.println("a/b=" + (a / b) + " a%b=" + (a % b)); // integer division truncates

        // Relational
        System.out.println("a>b=" + (a > b) + " a==b=" + (a == b) + " a!=b=" + (a != b));

        // Logical
        boolean p = true, q = false;
        System.out.println("p&&q=" + (p && q) + " p||q=" + (p || q) + " !p=" + (!p));

        // Bitwise - very common in DSA (masks, XOR tricks, subsets)
        System.out.println("a&b=" + (a & b));   // AND
        System.out.println("a|b=" + (a | b));   // OR
        System.out.println("a^b=" + (a ^ b));   // XOR - swap without temp, find unique element
        System.out.println("~a=" + (~a));       // NOT
        System.out.println("a<<1=" + (a << 1)); // left shift = multiply by 2
        System.out.println("a>>1=" + (a >> 1)); // right shift = divide by 2
        System.out.println("-8>>>1=" + (-8 >>> 1)); // unsigned right shift, fills with 0

        // Assignment operators
        int x = 5;
        x += 2; x -= 1; x *= 3; x /= 2; x %= 4;
        System.out.println("x after compound assignment: " + x);

        // Ternary operator
        int max = (a > b) ? a : b;
        System.out.println("max(a,b) via ternary: " + max);

        // Increment / decrement
        int n = 5;
        System.out.println("n++ = " + (n++) + ", now n=" + n); // post-increment
        System.out.println("++n = " + (++n));                  // pre-increment
    }
}
