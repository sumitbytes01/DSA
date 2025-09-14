package org.dsa.ArrayHard;

public class PascalTrianglePrintARow {
    public static void main(String[] args) {
        // brute force
        bruteForce();
        // optimum approach
        bestSolution();
    }

    private static void bestSolution() {
        int row = 6;
        int ans = 1;
        System.out.print(ans+ " ");
        for (int i = 1; i < row; i++) {
            ans = ans*(row-i);
            ans = ans/(i);
            System.out.print(ans+" ");
        }
    }

    private static void bruteForce() {
        int row = 6;
        int res = 1;
        for (int col = 1; col <= row; col++) {
            for (int i = 0; i < col-1; i++) {
                res = (row-1-i)*res;
                res = res/(i+1);
            }
            System.out.println(res+ " ");
            res = 1;
        }
    }
}
