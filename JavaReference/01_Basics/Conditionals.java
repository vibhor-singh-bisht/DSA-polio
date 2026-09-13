// if/else, switch statement, switch expression, and ternary operator.
public class Conditionals {

    public static void main(String[] args) {
        int score = 75;

        // Basic if / else if / else
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // Classic switch statement (falls through without break)
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // Modern switch expression (Java 14+), no fall-through, returns a value
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other day";
        };
        System.out.println("switch expression result: " + dayName);

        // Ternary operator - compact if/else for simple value selection
        int a = 5, b = 8;
        int min = (a < b) ? a : b;
        System.out.println("min: " + min);
    }
}
