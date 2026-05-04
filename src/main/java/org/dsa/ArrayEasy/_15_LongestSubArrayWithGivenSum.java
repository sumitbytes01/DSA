package org.dsa.ArrayEasy;

public class _15_LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int gSum = 8;
        int[] array = {2, 3, 5, 1, 9};
        int n = array.length;
        // 4 approaches
        // 1 find every subarray
        // 2 optimize find all subarrays approach
        // 3 prefix sum
        // 4 two pointer
        int end = 0;
        int start = 0;
        int sum = array[0];
        int maxLen = 0;
        while(end<n){
            while(end<n && sum>gSum){
                sum = sum - array[start];
                start++;
            }
            if(sum==gSum){
                maxLen = Math.max(maxLen, end-start+1);
                System.out.println(start+"-"+end+" Len: "+maxLen);
            }
            end++;
            if(end<n){
                sum = sum + array[end];
            }
        }
    }
}