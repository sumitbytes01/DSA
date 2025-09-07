package org.dsa.patterns;

public class Twenty {
    public static void main(String[] args) {
        int n = 5;
        int space = 2*n-2;
        for (int i = 0; i < 2*n; i++) {
            int stars = i;
            if(i>=n)
                stars = 2*n-i-2;
            for (int j = 0; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            if(i>=n-1)
                space = space+2;
            else
                space = space-2;
            stars = i;
            if(i>=n)
                stars = 2*n-i-2;
            for (int j = 0; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
