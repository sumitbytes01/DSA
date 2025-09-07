package org.dsa.patterns;

public class Nineteen {
    public static void main(String[] args) {
        int n = 5;
        int spaces = 0;
        for (int i = 0; i < 2*n; i++) {
            int stars = n-i;
            if(i>4)
                stars = i-n+1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <spaces; j++) {
                System.out.print(" ");
            }
            if (i==n-1)
                spaces = spaces;
            else if(i>n-1)
                spaces = spaces-2;
            else
                spaces = spaces+2;
            stars = n-i;
            if(i>4)
                stars = i-n+1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
