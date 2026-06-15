package org.dsa.patterns;

public class _15 {
    static void main() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < n-i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
