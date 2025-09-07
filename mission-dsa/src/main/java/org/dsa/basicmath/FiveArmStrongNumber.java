package org.dsa.basicmath;

public class FiveArmStrongNumber {
    public static void main(String[] args) {
        //O(log10N + 1)
        int num = 153;
        int tempNum = num;
        int noOfDigits = (int) (Math.log10(tempNum) + 1);
        int res = 0;
        while (tempNum != 0) {
            int digit = tempNum % 10;
            res = (int) (res + Math.pow(digit, noOfDigits));
            tempNum = tempNum / 10;
        }
        if (res==num){
            System.out.println("Its an armstrong number");
        }
        else System.out.println("Its not an armstrong number");
    }
}
