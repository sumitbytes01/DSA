package org.dsa.basicmath;

public class SixAllDivisors {
    public static void main(String[] args) {
        //O(N)
        int num = 36;
        for (int i = 1; i<=num; i++){
            if (num%i == 0)
                System.out.print(i+" ");
        }
        System.out.println();
        //if d is a divisor of n then n/d is also a divisor of n.
        //This property is symmetric about the square root of n by traversing
        // just the first half we can avoid redundant iteration and computations
        // improving the efficiency of the algorithm.

        //O(sqrt(N))
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num%i == 0){
                System.out.print(i+" ");
                if(i != num/i){
                    System.out.print(num/i+" ");
                }
            }
        }
    }
}
