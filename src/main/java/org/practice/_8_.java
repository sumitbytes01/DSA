package org.practice;

public class _8_ {
    static void main() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // spaces:
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars:
            for (int j = 0; j < 2*n-1-2*i; j++) {
                System.out.print("*");
            }

            // spaces:
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
