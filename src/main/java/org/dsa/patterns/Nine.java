package org.dsa.patterns;

public class Nine {
    public static void main(String[] args) {
        int n = 5;
        simpleApproach(n);
        betterApproach(n);
    }

    private static void betterApproach(int n) {
        int count = 0;
        for (int i = 0; i < 2*n; i++) {
            int space = n-i-1;
            if(i>4)
                space = i-n;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            int stars = 2*i+1;
            if(i>4) {
                stars = 2 * n - 2 * count - 1;
                count++;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void simpleApproach(int n) {
        for (int i = 0; i < n; i++) {
            // 4 3 2 1 0
            for (int j = n -i-1; j >=0 ; j--) {
                System.out.print(" ");
            }
            // 1 3 5 7 9
            for(int j = 1; j <= 2*i+1 ; j++) {
                System.out.print("*");
            }
            for (int j = n -i-1; j >=0 ; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n -i-1)+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
