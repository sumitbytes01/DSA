package org.dsa.patterns;

public class Sixteen {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
        System.out.println("====================");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)((int)'A'+i));
            }
            System.out.println();
        }
    }
}
