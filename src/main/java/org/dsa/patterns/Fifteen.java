package org.dsa.patterns;

public class Fifteen {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch < 'A'+n-i ; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("====================");
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < n-i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        System.out.println("====================");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print((char)((int)'A'+j-1));
            }
            System.out.println();
        }
    }
}
