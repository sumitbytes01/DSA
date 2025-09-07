package org.dsa.patterns;

public class SevenTeen {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n; i++) {
            char ch = 'A'-1;
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i-1; j++) {
                if(j>(2*i-1)/2)
                    System.out.print(--ch);
                else
                    System.out.print(++ch);
            }
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
