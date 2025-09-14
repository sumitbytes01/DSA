package org.dsa.ArrayMedium;

public class RowColMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int row = matrix.length;
        int col = matrix[0].length;
        // no extra space
        int[][] matrixS1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        markRolColAsZeroNoExtraSpace(matrixS1);
        // n^2
        markRolColAsZero(matrix);
        int[][] matrixS = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        // n^3
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrixS[i][j] == 0) {
                    // mark row and col as -1
                    markRowCol(matrixS, i, j);
                }
            }
        }

        // print:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrixS[i][j] == -1)
                    matrixS[i][j] = 0;
                System.out.print(matrixS[i][j]);
            }
            System.out.println();
        }
    }

    private static void markRolColAsZeroNoExtraSpace(int[][] matrix) {
        int row = matrix.length;
        int col = matrix.length;
        int col0 = 1;
        int[] colArr = new int[col];
        int[] rowArr = new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j] == 0)
                {
                    // mark the ith row
                    matrix[i][0] = 0;
                    // mark the jth col
                    if(j !=0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(matrix[i][j] != 0)
                {
                    // check for rows and column
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if(matrix[0][0] == 0){
            for (int j = 0; j < col; j++) {
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for (int i = 0; i < col; i++) {
                matrix[i][0] = 0;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j] == -1)
                    matrix[i][j] = 0;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void markRolColAsZero(int[][] matrix) {
        int row = matrix.length;
        int col = matrix.length;
        int[] colArr = new int[col];
        int[] rowArr = new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j] == 0)
                {
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(rowArr[i] == 1 || colArr[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j] == -1)
                    matrix[i][j] = 0;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void markRowCol(int[][] matrix, int m, int n) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == m || j == n) {
                    matrix[i][j] = -1;
                }
            }
        }
    }
}
