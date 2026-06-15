package org.dsa.patterns;

public class _20 {
    static void main() {
        int n = 5;
        int spaces = 2*n;
        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if(i>5)
                stars = 2*n-i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            if(i>5)
                spaces = spaces+2;
            else
                spaces = spaces-2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            if(i>5)
                stars = 2*n-i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
1,8,1
2,6,2
3,4,3
4,2,4
5,0,5
4,2,4
3,4,3
2,6,2
1,8,1
*/
