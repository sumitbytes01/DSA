package org.dsa.ArrayMedium;

public class _14_SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,   2,  3, 4},
                          {12, 13, 14, 5},
                          {11, 16, 15, 6},
                          {10,  9,  8, 7}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int right = cols - 1;
        int bottom = rows - 1;
        int left = 0;
        while (top <= bottom && left <= right) {
            //left to right
            for (int i = left; i <= right; i++) {
                System.out.println(matrix[top][i]);
            }
            top++;
            // top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.println(matrix[i][right]);
            }
            right--;
            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println(matrix[bottom][i]);
                }
                bottom--;
            }
            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(matrix[i][left]);
                }
                left++;
            }
        }
    }
}
