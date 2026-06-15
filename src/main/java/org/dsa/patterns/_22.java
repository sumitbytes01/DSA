package org.dsa.patterns;

public class _22 {
    static void main() {
        int n = 4;
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int right = 2*n-1-j-1;
                int bottom = 2*n-1-i-1;
                System.out.print(4-Math.min(top, Math.min(bottom, Math.min(left, right))));
            }
            System.out.println();
        }

    }
}
