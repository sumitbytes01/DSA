package org.practice;

public class _22_ {
    static void main() {
        int n = 4;
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int bottom = 2*n-2-i;
                int right = 2*n-2-j;
                int minDist = Math.min(top, Math.min(left, Math.min(bottom, right)));
                System.out.print(n-minDist+" ");
            }
            System.out.println();
        }
    }
}
