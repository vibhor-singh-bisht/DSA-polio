// for, while, do-while, enhanced for-each, break/continue, and labeled loops.
public class Loops {

    public static void main(String[] args) {
        // Classic for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("for i=" + i);
        }

        // While loop - condition checked before each iteration
        int n = 0;
        while (n < 3) {
            System.out.println("while n=" + n);
            n++;
        }

        // Do-while loop - body runs at least once
        int m = 0;
        do {
            System.out.println("do-while m=" + m);
            m++;
        } while (m < 3);

        // Enhanced for-each loop - preferred for iterating collections/arrays
        int[] arr = {10, 20, 30};
        for (int value : arr) {
            System.out.println("for-each value=" + value);
        }

        // break - exits the nearest loop entirely
        for (int i = 0; i < 5; i++) {
            if (i == 3) break;
            System.out.println("break demo i=" + i);
        }

        // continue - skips to the next iteration
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) continue;
            System.out.println("continue demo odd i=" + i);
        }

        // Labeled loops - useful to break/continue an outer loop from a nested loop
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) continue outer; // skips to next i, common in matrix/grid DSA problems
                System.out.println("labeled i=" + i + " j=" + j);
            }
        }
    }
}
