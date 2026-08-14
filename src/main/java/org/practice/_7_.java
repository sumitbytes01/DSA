package org.practice;

public class _7_ {
    static void main() {
        int n = 6;
        for (int i = 0; i < n; i++) {
            // spaces:
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            // starts:
            for (int j = 0; j < 2*i+1 ; j++) {
                System.out.print("*");
            }
            // spaces:
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
