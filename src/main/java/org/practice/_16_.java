package org.practice;

public class _16_ {
    static void main() {
        int n = 5;
        char startChar = 'A';
        for(int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(startChar);
            }
            System.out.println();
            startChar++;
        }
    }
}
