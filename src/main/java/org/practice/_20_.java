package org.practice;

public class _20_ {
    static void main() {
        int n = 5;
        int spaces = 8;
        for (int i = 1; i <= 2*n-1; i++) {
            //stars
            int stars = i;
            if(i>5)
                stars = 2*n-i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            // spaces
            if(i>5)
                spaces = spaces+2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            if(i<5)
                spaces = spaces-2;
            //stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
