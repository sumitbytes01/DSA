package org.dsa.patterns;

public class _17 {
    static void main() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                if(j<(2*i-1)/2)
                    System.out.print(ch++);
                else if (j == (2*i-1)/2) {
                    System.out.print(ch);
                } else
                    System.out.print(--ch);
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
3,1,3
2,3,2
1,5,1
0,7,0
*/
