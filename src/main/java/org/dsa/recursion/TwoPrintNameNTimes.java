package org.dsa.recursion;

public class TwoPrintNameNTimes {
    public static void main(String[] args) {
        String name = "Thiya";
        printNameNTimes(1, name);
    }

    private static void printNameNTimes(int i, String name) {
        if (i > 10)
            return;
        ;
        System.out.println(i+" "+name);
        printNameNTimes(++i, name);
    }
}
