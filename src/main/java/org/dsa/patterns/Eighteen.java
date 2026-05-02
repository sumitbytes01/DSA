package org.dsa.patterns;

public class Eighteen {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E'-i); ch <='E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("====================");
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A'+n-i-1); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("====================");
        for (int i = 0; i < n; i++) {
            for (int j = 'E'-i; j <='E' ; j++) {
                System.out.print((char)(j));
            }
            System.out.println();
        }
        System.out.println("====================");
        for (int i = 1; i <= n ; i++) {
            char ch = (char) ('E'-i);
            for (int j = 1; j <= i; j++) {
                System.out.print((char)((int)ch+j));
            }
            System.out.println();
        }
    }
}
