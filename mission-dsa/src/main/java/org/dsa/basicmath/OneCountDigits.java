package org.dsa.basicmath;

public class OneCountDigits {
    public static void main(String[] args) {
        // O(logn+1)
        int num = 123432345;
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println(count);
        // O(1)
        // second approach - Optimal approach
        //log10 N operation gives the logarithmic base 10 of which returns the power to which 10 must be raised to, to be equal to N.
        //We add 1 to the result which accounts for the possibility that N itself is a power of 10.
        //Financially cast the result to an integer to ensure that it is rounded down to the nearest whole number.
        num = 123456789;
        count = (int) Math.log10(num)+1;
        System.out.println(count);
    }
}
