package org.dsa.recursion;

public class OnerPrintingSomethingNTimes {
    public static void main(String[] args) {
        int n = 10;
        printTillN(10);
    }

    private static void printTillN(int i) {
        if(i==0)
            return;
        System.out.println(i);
        printTillN(--i);
    }
}
