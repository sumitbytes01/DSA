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
    }
}
