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
    }
}
