package org.dsa.ArrayHard;

public class _1_PascalTrianglePrintARow {
    public static void main(String[] args) {
        // brute force
        bruteForce();
        System.out.println("=====================");
        // optimum approach
        bestSolution();
        System.out.println("=====================");
        // new brute
        newBrute();
    }

    private static void newBrute() {
        int rowNum = 6;
        int res = 1;
        for (int i = 1; i <= rowNum; i++) {
            for (int j = 1; j <i ; j++) {
                res = res*(rowNum-j);
                res = res/j;
            }
            System.out.println(res);
            res = 1;
        }
    }

    private static void bestSolution() {
        int row = 5;
        int ans = 1;
        System.out.print(ans+ " ");
        for (int i = 1; i < row; i++) {
            ans = ans*(row-i);
            ans = ans/(i);
            System.out.println(ans+" ");
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
            System.out.println(res + " ");
            res = 1;
        }
    }
}
