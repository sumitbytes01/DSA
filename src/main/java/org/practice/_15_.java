package org.practice;

public class _15_ {
    static void main() {
        int n = 5;
        char startChar = 'A';
        for (int i = 0; i < n; i++) {
            for (char ch = startChar; ch<startChar+n-i ; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
