package org.dsa.ArrayEasy;

public class _15_LongestSubArrayWithGivenSum {
    public static void main(String[] args) {

        int gSum = 8;
        int[] array = {2, 3, 5, 1, 9};
        int n = array.length;

        int start = 0;
        int end = 0;
        int sum = 0;
        int maxLen = 0;

        while (end < n) {

            // Add current element first
            sum = sum + array[end];

            // Shrink window if sum becomes larger
            while (sum > gSum) {
                sum = sum - array[start];
                start++;
            }

            // Check answer
            if (sum == gSum) {
                maxLen = Math.max(maxLen, end - start + 1);
                System.out.println(start + "-" + end + " Len: " + maxLen);
            }

            end++;
        }
    }
}