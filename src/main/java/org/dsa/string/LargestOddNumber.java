package org.dsa.string;

public class LargestOddNumber {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("35427"));

        System.out.println(largestOddNumberForLoop("4206"));
        System.out.println(largestOddNumberForLoop("52"));
        System.out.println(largestOddNumberForLoop("35427"));
    }

    public static String largestOddNumber(String nums) {
        int i = nums.length() - 1;
        while (i >= 0) {
            while (i >= 0 && (int) nums.charAt(i) % 2 == 0)
                i--;
            // If pointer goes out of bounds, break
            if (i < 0) break;

            int end = i;
            return nums.substring(0, end+1);
        }
        return "";
    }
    // simplified using for loop
    // Character class make the processing slow
    public static String largestOddNumberForLoop(String nums) {
        for(int i = nums.length()-1; i>=0;i--){
            if(Character.getNumericValue(nums.charAt(i)) %2 == 1){
                return nums.substring(0,i+1);
            }
        }
        return "";
    }
    // simplified using for loop
    public static String largestOddNumberForLoopFast(String nums) {
        for(int i = nums.length()-1; i>=0;i--){
            if((int)nums.charAt(i) %2 == 1){
                return nums.substring(0,i+1);
            }
        }
        return "";
    }
}
