package org.dsa.recursion;

public class NineFibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int num = 20;
        System.out.print(first+" "+second+" ");

        for (int i = 0; i <num; i++) {
            int third = first+second;
            first = second;
            second = third;
            System.out.print(third+" ");
        }
        System.out.println("");
        // fibonacci recursion
        // O(2^n), exponential
        int fiboNum = fibonacciRecursionFunctional(num);
        System.out.println(fiboNum);
    }

    private static int fibonacciRecursionFunctional(int num) {
        if(num<=1)
            return num;
        int first = fibonacciRecursionFunctional(num-1);
        int second= fibonacciRecursionFunctional(num-2);
        return first+second;
    }
}
