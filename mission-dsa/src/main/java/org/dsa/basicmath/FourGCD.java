package org.dsa.basicmath;

public class FourGCD {
    public static void main(String[] args) {
        //O(min(N1, N2))
        int n1 = 9, n2 = 12;
        int gcd = 1;
        for (int i = 2; i < Math.min(n1,n2); i++) {
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        //O(min(N1, N2))
        gcd = 1;
        for (int i = Math.min(n1,n2); i>1; i--) {
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
