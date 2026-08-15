package org.practice;

public class _19_ {
    static void main() {
        int n = 5;
        int spaces = 0;
        for (int i = 0; i < 2*n; i++) {
            // stars
            int stars = n-i;
            if(i>=5)
                stars = i-n+1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            // spaces
            if(i>=5)
                spaces = spaces-2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            if(i<5)
                spaces = spaces+2;

            // stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
