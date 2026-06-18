package org.dsa.ArrayMedium;

public class _13_RotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        bruteForce(matrix); // n^2 space
        matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        optimalSolution(matrix);
    }

    private static void optimalSolution(int[][] matrix) {
        printMatrix(matrix);
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (i != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        printMatrix(matrix);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols/2; j++) { // else you will swap each element twice.
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols-j-1];
                matrix[i][cols-j-1] = temp;
            }
        }
        printMatrix(matrix);
    }

    private static void bruteForce(int[][] matrix) {
        printMatrix(matrix);
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ansMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ansMatrix[j][rows - i - 1] = matrix[i][j];
            }
        }
        printMatrix(ansMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int[] ints : matrix) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println("============================");
    }
}