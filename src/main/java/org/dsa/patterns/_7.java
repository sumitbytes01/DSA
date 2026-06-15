package org.dsa.patterns;

public class _7 {
    static void main() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
4,1,4
3,3,3
2,5,2
1,7,1
0,9,0
*/
