// 2D arrays in Java are "arrays of arrays" - rows can even have different lengths (jagged).
public class TwoDimensionalArrays {

    public static void main(String[] args) {
        // Fixed-size grid declaration
        int[][] grid = new int[3][4]; // 3 rows, 4 columns, all zero

        // Literal initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access
        System.out.println("matrix[1][2]: " + matrix[1][2]); // row 1, col 2 -> 6

        // Dimensions
        System.out.println("rows: " + matrix.length);
        System.out.println("cols in row 0: " + matrix[0].length);

        // Iteration - nested loops (standard for grid/matrix DSA problems)
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // Enhanced for-each over rows then columns
        for (int[] r : matrix) {
            for (int val : r) {
                System.out.print(val + " ");
            }
        }
        System.out.println();

        // Jagged array - rows with different lengths
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1};
        jagged[1] = new int[]{1, 2};
        jagged[2] = new int[]{1, 2, 3};
        for (int[] r : jagged) {
            System.out.println("jagged row length: " + r.length);
        }

        // Assigning grid element
        grid[0][0] = 5;
        System.out.println("grid[0][0]: " + grid[0][0]);
    }
}
