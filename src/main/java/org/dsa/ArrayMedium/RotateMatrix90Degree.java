package org.dsa.ArrayMedium;

public class RotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // Output: [[7,4,1],[8,5,2],[9,6,3]]
        // brute force
        bruteForce(matrix);
        // second method
        // transpose and reverse
        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
        transposeAndReverse(matrix2, matrix2.length, matrix2[0].length);
    }

    private static void transposeAndReverse(int[][] matrix2, int rows, int cols) {
        printMatrix(matrix2);
        //transpose
        for (int i = 0; i < rows-1; i++) {
            for (int j = i + 1; j < cols; j++) {
                // swap
                int temp = matrix2[i][j];
                matrix2[i][j] = matrix2[j][i];
                matrix2[j][i] = temp;
            }
        }printMatrix(matrix2);
            // reverse matrix
            for (int i = 0; i < matrix2.length; i++) {
                int start = 0, end = matrix2[i].length - 1;
                while (start < end) {
                    int temp = matrix2[i][start];
                    matrix2[i][start] = matrix2[i][end];
                    matrix2[i][end] = temp;
                    start++;
                    end--;
                }
            }
        printMatrix(matrix2);
        }

    private static void bruteForce(int[][] matrix) {
        // next time draw the matrix to calculate the calculations
        // O(n^2) both time and space
        int rows = matrix.length;
        int cols = matrix[0].length;
        int newMatrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newMatrix[j][rows-i-1] = matrix[i][j];
                System.out.println(newMatrix[rows-1-i][cols-j-1]);
            }
        }
        printMatrix(newMatrix);
    }
    private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
