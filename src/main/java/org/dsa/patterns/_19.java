package org.dsa.patterns;

public class _19 {
    static void main() {
        int n = 5;
        int spaces = 0;
        for (int i = 1; i <= 2 * n; i++) {
            int stars = n - i;
            if (i > 5)
                stars = i - n - 1;
            for (int j = 0; j <= stars; j++) {
                System.out.print("*");
            }
            if (i == 6) {
                spaces = spaces;
            } else if (i > 5) {
                spaces = spaces - 2;
            } else {
                spaces = spaces + 2;
            }
            for (int j = 2; j < spaces; j++) {
                System.out.print(" ");
            }
            stars = n - i;
            if (i > 5)
                stars = i - n - 1;
            for (int j = 0; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
5,0,5
4,2,4
3,4,3
2,6,2
1,8,1
1,8,1
2,6,2
3,4,3
4,2,4
5,0,5
*/