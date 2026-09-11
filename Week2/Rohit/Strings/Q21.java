import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        // Creating an array of size 9 that holds HashSet for each row, column, and box
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        // Initializing the HashSet arrays for rows, columns, and boxes,bcz at
        // declaration they are just null
        for (int i = 0; i < n; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                char value = board[i][j];
                // Used to specify in which box and at which index will the value be placed
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (rows[i].contains(value) || cols[j].contains(value) || boxes[boxIndex].contains(value)) {
                    return false;
                }

                rows[i].add(value);
                cols[j].add(value);

                boxes[boxIndex].add(value);

            }
        }

        return true;
    }
}