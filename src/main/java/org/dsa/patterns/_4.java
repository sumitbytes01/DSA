package org.dsa.patterns;

public class _4 {
    static void main() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
