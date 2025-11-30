package org.dsa.patterns;

public class Eleven {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 0; i < n; i++) {
            if(i%2!=0)
                num=0;
            else num=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                num = 1-num;
            }
            System.out.println();
        }
        System.out.println("==============================");
        int m = 5;
        for (int i = 0; i <m; i++) {
            int r = 1;
            if(i%2 != 0)
                r = 0;
            for (int j = 0; j <=i ; j++) {
                System.out.print(r);
                r = 1-r;
            }
            System.out.println();
        }
    }
}
