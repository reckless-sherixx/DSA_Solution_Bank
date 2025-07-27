package LeetCode.Medium;

public class Q59 {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int val = 1;
        int startRow = 0;
        int endCol = matrix.length - 1;
        int startCol = 0;
        int endRow = matrix.length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                matrix[startRow][i] = val++;
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endCol] = val++;
            }
            endCol--;

            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    matrix[endRow][i] = val++;
                }
                endRow--;
            }

            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    matrix[i][startCol] = val++;
                }
                startCol++;
            }
        }
        return matrix;
    }
}
