package org.dsa.patterns;

import org.dsa.Main;

public class TwentyTwo {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = 2*n-1-1-j;
                int bottom = 2*n-1-1-i;
                System.out.print(4-Math.min(bottom,Math.min(left,Math.min(right,top))));
            }
            System.out.println();
        }
    }
}
