package org.dsa.ArrayEasy;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int gSum = 10;
        int array[] = {2,3,5,1,9};
        int n = array.length;
        // 4 approaches
        // 1 find every subarray
        // 2 optimize find all subarrays approach
        // 3 prefix sum
        // 4 two pointer
        int sum = array[0];
        int max = 0;
        int start = 0;
        int end = 0;
        while(end <n){
            while(sum>gSum && end>start){
                sum = sum - array[start];
                start = start+1;
            }
            if(sum == gSum){
                max = Math.max(max, end-start+1);
            }
            end++;
            if (end<n)
                sum = sum+array[end];
        }
        System.out.println(max);
    }
}
