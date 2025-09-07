package org.dsa.recursion;

public class FourPrintNTo1Recursion {
    public static void main(String[] args) {
        printNTo1Parameter(10);
        System.out.println();
        printNTo1BackTracking(1);
    }

    private static void printNTo1BackTracking(int i) {
        if(i>10)
            return;
        printNTo1BackTracking(i+1);
        System.out.println(i);
    }

    private static void printNTo1Parameter(int i) {
        if(i<1)
            return;
        System.out.println(i);
        printNTo1Parameter(--i);
    }
}
