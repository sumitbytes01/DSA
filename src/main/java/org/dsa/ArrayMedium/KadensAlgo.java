package org.dsa.ArrayMedium;

public class KadensAlgo {
    public static void main(String[] args) {
         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
         // maximumSubArraySum
        // brute force O(n^3)
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum = sum+nums[k];
                }
                maxSum = Math.max(sum, maxSum);
            }
        }
        System.out.println(maxSum);
        // brute force O(n^2)
        maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum+nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);

        // kaden's algo
        int sum = 0;
        maxSum = 0;
        int starts = -1, ends = -1;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if(sum == 0){
                start = i;
            }
            sum = sum+nums[i];
            if(sum>maxSum){
                maxSum = sum;
                starts = start;
                ends = i;
            }
            if (sum <0){
                sum = 0;
            }
        }
        System.out.println(maxSum+" I J "+starts+" "+ends);
        for (int i = starts; i <= ends; i++) {
            System.out.println(nums[i]);
        }
    }

}
