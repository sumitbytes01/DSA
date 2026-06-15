package org.dsa.patterns;

public class _10 {
    static void main() {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > 5)
            {
                stars = i - 2 * count;
                count++;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
1   1
2   2
3   3
4   4
5   5
4   6
3   7
2   8
1   9
 */
