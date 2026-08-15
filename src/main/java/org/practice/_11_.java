package org.practice;

public class _11_ {
    static void main() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int num = 1;
            if(i%2 == 0)
                num = 0;
            for (int j = 0; j <=i ; j++) {
                num = 1-num;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
