package org.dsa.patterns;

public class _9 {
    static void main() {
        int n = 5;
        int counter = 0;
        for (int i = 1; i <= 2*n; i++) {
            int spaces = n-i;
            if(i>5)
                spaces = i-n-1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            int stars = 2*i-1;
            if(i>5)
            {
                stars = 2*n-2*counter -1;
                counter++;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
4,1,4   1
3,3,3   2
2,5,2   3
1,7,1   4
0,9,0   5
0,9,0   6
1,7,1   7
2,5,2   8
3,3,3   9
4,1,4   10
*/