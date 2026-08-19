package org.dsa.basicmath;

public class _7_CheckPrimeNumber {
    public static void main(String[] args) {
        int num = 17;
        boolean flag = false;
        // improve next time with count;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Its a prime number");
        }
        else System.out.println("Its not a prime number");
    }
}
