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
    }
}
