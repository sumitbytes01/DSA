package org.dsa.patterns;

public class Ten {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i++) {
            int stars = i;
            if(i >5)
                stars = n-i;
            for (int j = 0; j <stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
