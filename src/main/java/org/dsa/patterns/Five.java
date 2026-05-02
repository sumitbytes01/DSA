package org.dsa.patterns;

public class Five {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");

        for (int i = n; i >0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("======================");
        for(int i = 0; i<n;i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
