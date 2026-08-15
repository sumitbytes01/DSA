package org.practice;

public class _10_ {
    static void main() {
        int n = 4;
        int count = 0;
        for (int i = 0; i <= 2*n;i++) {
            int stars = i;
            if(i>n)
                stars = i- 2*++count;
            for (int j = 0; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
