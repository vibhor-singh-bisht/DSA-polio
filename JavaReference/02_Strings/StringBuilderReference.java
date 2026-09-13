// StringBuilder is a mutable sequence of characters - use it for heavy string building
// in loops instead of repeated String concatenation (which is O(n) per operation).
public class StringBuilderReference {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello");     // add to the end
        sb.append(", ").append("World"); // chainable
        sb.append('!');
        System.out.println("after append: " + sb);

        sb.insert(5, " there"); // insert at index
        System.out.println("after insert: " + sb);

        sb.delete(5, 11); // remove range [start, end)
        System.out.println("after delete: " + sb);

        sb.deleteCharAt(0); // remove single char
        System.out.println("after deleteCharAt: " + sb);

        sb.setCharAt(0, 'E'); // replace a single char
        System.out.println("after setCharAt: " + sb);

        System.out.println("length(): " + sb.length());
        System.out.println("charAt(0): " + sb.charAt(0));

        sb.reverse(); // reverse in place - handy for palindrome checks
        System.out.println("after reverse: " + sb);

        String result = sb.toString(); // convert back to an immutable String
        System.out.println("toString(): " + result);

        // Common DSA pattern: building a result string efficiently in a loop
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            builder.append(i).append(',');
        }
        if (builder.length() > 0) {
            builder.setLength(builder.length() - 1); // trim trailing comma
        }
        System.out.println("built in loop: " + builder);
    }
}
