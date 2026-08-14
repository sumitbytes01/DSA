package org.practice;

public class _5_ {
    static void main() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=n-i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
