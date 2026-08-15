package org.practice;

public class _12_ {
    static void main() {
        int n = 4;
        for (int i = 0; i < n; i++) {
            // forward count
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1+"");
            }
            // spaces
            for (int j = 0; j < 2*(n-i-1); j++) {
                System.out.print(" ");
            }
            // reverse count
            for (int j = 0; j <= i; j++) {
                System.out.print(i-j+1+"");
            }
            System.out.println();
        }
    }
}
