package org.dsa.string;

public class _3_LargestOddNumber {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("35427"));
    }

    private static String largestOddNumber(String number) {
        for (int i = number.length()-1; i >=0 ; i--) {
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            if(num %2 != 0){
                return number.substring(0,i+1);
            }
        }
    return "none";}

}