// String is immutable in Java - every "modification" method returns a NEW string.
public class StringReference {

    public static void main(String[] args) {
        String s = "Hello, World!";

        System.out.println("length(): " + s.length());
        System.out.println("charAt(1): " + s.charAt(1));
        System.out.println("substring(7): " + s.substring(7));
        System.out.println("substring(7,12): " + s.substring(7, 12));
        System.out.println("indexOf('o'): " + s.indexOf('o'));
        System.out.println("lastIndexOf('o'): " + s.lastIndexOf('o'));
        System.out.println("contains(\"World\"): " + s.contains("World"));
        System.out.println("startsWith(\"Hello\"): " + s.startsWith("Hello"));
        System.out.println("endsWith(\"!\"): " + s.endsWith("!"));
        System.out.println("equals(\"hello, world!\"): " + s.equals("hello, world!"));
        System.out.println("equalsIgnoreCase: " + s.equalsIgnoreCase("hello, world!"));
        System.out.println("replace: " + s.replace("World", "Java"));
        System.out.println("toUpperCase: " + s.toUpperCase());
        System.out.println("toLowerCase: " + s.toLowerCase());
        System.out.println("trim: [" + "  spaced  ".trim() + "]");
        System.out.println("isEmpty: " + "".isEmpty());
        System.out.println("isBlank: " + "   ".isBlank());

        // split - returns a String[] (very common for parsing input lines)
        String csv = "a,b,c,d";
        String[] parts = csv.split(",");
        System.out.println("split length: " + parts.length + ", first: " + parts[0]);

        // toCharArray - common for char-level manipulation in DSA
        char[] chars = s.toCharArray();
        System.out.println("toCharArray first char: " + chars[0]);

        // String.valueOf / parsing
        System.out.println("String.valueOf(42): " + String.valueOf(42));
        System.out.println("Integer.parseInt(\"42\"): " + Integer.parseInt("42"));

        // String concatenation and comparison
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println("a == b (pooled literals): " + (a == b)); // true
        System.out.println("a == c (new object): " + (a == c));       // false
        System.out.println("a.equals(c): " + a.equals(c));            // true, always use equals()

        // compareTo - lexicographic comparison, useful for sorting strings
        System.out.println("\"apple\".compareTo(\"banana\"): " + "apple".compareTo("banana"));

        // String.join - build a string from a collection/array
        System.out.println(String.join("-", "2024", "01", "01"));

        // Immutability demo: concatenation creates a new String each time
        String base = "abc";
        String changed = base.concat("d");
        System.out.println("base unchanged: " + base + ", changed: " + changed);
    }
}
