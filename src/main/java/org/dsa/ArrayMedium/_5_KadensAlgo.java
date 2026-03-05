package org.dsa.ArrayMedium;

public class _5_KadensAlgo {
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

        // kadane's algo
        int sum = 0;
        maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            maxSum = Math.max(maxSum, sum);
            if (sum <0){
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }

}
