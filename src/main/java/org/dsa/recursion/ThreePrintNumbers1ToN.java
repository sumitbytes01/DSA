package org.dsa.recursion;

public class ThreePrintNumbers1ToN {
    public static void main(String[] args) {
        parameterApproach(1,10);
        System.out.println();
        backTracking(10,10);
    }

    private static void backTracking(int i, int n) {
        if(i==1)
            return;
        backTracking(i-1,n);
        System.out.println(i);
    }

    private static void parameterApproach(int i, int n) {
        if(i==n+1)
            return;
        System.out.println(i);
        parameterApproach(i+1,n);
    }
}
