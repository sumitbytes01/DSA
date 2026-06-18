package org.dsa.ArrayMedium;

public class _12_RowColMatrixZero {
    static void main() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        bruteForce(matrix);
        matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        betterApproach(matrix);
        matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        optimalApproach(matrix);
    }

    private static void optimalApproach(int[][] matrix) {
        printMatrix(matrix);
        int rows = matrix.length;
        int cols = matrix[0].length;
        int col0 = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j!=0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if(matrix[i][j] != 0){
                    if(matrix[0][j] == 0 || matrix[i][0] ==0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if(matrix[0][0] ==0){
            for (int i = 0; i < cols; i++) {
                matrix[0][i] = 0;
            }
        }
        if(col0 == 0){
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
        System.out.println("============================");
        printMatrix(matrix);
    }

    private static void betterApproach(int[][] matrix) {
        printMatrix(matrix);
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] r = new int[rows];
        int[] c = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0){
                    r[j] = 1;
                    c[i] = 1;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(r[j]==1 ||c[i] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("============================");
        printMatrix(matrix);
    }

    private static void bruteForce(int[][] matrix) {
        printMatrix(matrix);
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0){
                    // mark row as -1
                    for (int l = 0; l < cols; l++) {
                        if(matrix[i][l] != 0)
                            matrix[i][l] = -1;
                    }
                    // mark the col as -1
                    for (int m = 0; m < rows; m++) {
                        if(matrix[m][j] != 0)
                            matrix[m][j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == -1)
                    matrix[i][j] = 0;
            }
        }
        System.out.println("==============================");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int[] ints : matrix) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
