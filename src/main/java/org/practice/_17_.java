package org.practice;

public class _17_ {
    static void main() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            char ch = '@';
            // chars
            for (int j = 0; j <2*i-1 ; j++) {
                if(j>= i)
                    System.out.print(--ch);
                else
                    System.out.print(++ch);
            }
            System.out.println();
        }
    }
}