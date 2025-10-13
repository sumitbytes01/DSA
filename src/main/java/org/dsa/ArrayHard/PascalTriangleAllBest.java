package org.dsa.ArrayHard;

public class PascalTriangleAllBest {
    public static void main(String[] args) {
        // find nth row and rth col
        // n-1 r-1
        int row = 5;
        int col = 3;
        int res = 1;
        for (int i = 0; i < col - 1; i++) {
            res = res * (row - i - 1);
            res = res / (i + 1);
        }
        System.out.println(res);

        // print the entire row
        row = 5;
        res = 1;
        System.out.print(res + " ");
        for (int i = 0; i < row - 1; i++) {
            res = res * (row - i - 1);
            res = res / (i + 1);
            System.out.print(res + " ");
        }
        System.out.println();
        // print the entire triangle
        for (int j = 1; j < 7 ; j++) {
            res = 1;
            System.out.print(res + " ");
            for (int i = 0; i < j - 1; i++) {
                res = res * (j - i - 1);
                res = res / (i + 1);
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
