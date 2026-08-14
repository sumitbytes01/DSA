package org.practice;

public class _9_ {
    static void main() {
        int n = 5;
        int stars = 1;
        for (int i = 0; i < 2*n; i++) {
            //  spaces
            int spaces = n-1-i;
            if(i>5)
                spaces = i-n;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // stars
            if(i<5 && i!= 0)
                stars +=2;
            else if(i>5)
                stars-=2;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
