package org.dsa.patterns;

public class Fourteen {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A'+i ; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("====================");
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i ; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        System.out.println("========================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print( (char) ((int)('A') + j));
            }
            System.out.println();

        }
    }
}
