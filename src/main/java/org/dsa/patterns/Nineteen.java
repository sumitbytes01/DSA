package org.dsa.patterns;

public class Nineteen {
    public static void main(String[] args) {
        int n = 5;
        int spaces = 0;
        for (int i = 1; i <= 2*n; i++) {
            int stars = n-i+1;
            if(i>n)
                stars = i-n;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if(i>n+1)
                spaces = spaces-2;
            else if(i<n+1)
                spaces = spaces+2;
            for (int j = 1; j <spaces-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
