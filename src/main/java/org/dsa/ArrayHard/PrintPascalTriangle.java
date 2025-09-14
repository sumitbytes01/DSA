package org.dsa.ArrayHard;

public class PrintPascalTriangle {
    public static void main(String[] args) {
        // bruteForce
        // O(n^3)
        bruteForce();
        // better solution
        // O(n^2)
        better();
    }

    private static void better() {
        int total = 10;
        for (int t = 1; t <total ; t++) {
            int ans = 1;
            System.out.print(ans+" ");
            for (int i = 1; i < t; i++) {
                ans = ans*(t-i);
                ans = ans/(i);
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }

    private static void bruteForce() {
        int row = 6;
        int res = 1;
        int total = 10;
        for (int  t= 1;  t<total ; t++) {
            for (int col = 1; col <= t; col++) {
                for (int i = 0; i < col-1; i++) {
                    res = (t-1-i)*res;
                    res = res/(i+1);
                }
                System.out.print(res+ " ");
                res = 1;
            }
            System.out.println();
        }
    }
}
