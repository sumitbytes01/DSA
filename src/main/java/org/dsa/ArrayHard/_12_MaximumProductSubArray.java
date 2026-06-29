package org.dsa.ArrayHard;

public class _12_MaximumProductSubArray {
    static void main() {
        int[] nums = {1,2,3,4,5,0};
        bruteForceSol(nums);
        int[] nums1 = {1,2,-3,0,-4,-5};
        bruteForceSol(nums1);
        betterBruteForceSol(nums1);
        optimalSolution(nums1);
    }

    private static void optimalSolution(int[] nums) {
        int n = nums.length-1;
        int prefix = 1;
        int suffix = 1;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i];
            if(prefix == 0)
                prefix = 1;
            if(suffix == 0)
                suffix = 1;
            maxProduct = Math.max(maxProduct, Math.max(suffix, prefix));
        }
        System.out.println(maxProduct);
    }

    private static void betterBruteForceSol(int[] nums) {
        int n = nums.length;
        int maxProduct = 0;
        for (int i = 0; i <n ; i++) {
            int product = 1;
            for (int j = i+1; j <n; j++) {
                product = product * nums[j];
            }
            maxProduct = Math.max(maxProduct, product);
        }
        System.out.println(maxProduct);
    }

    private static void bruteForceSol(int[] nums) {
        int n = nums.length;
        int maxProduct = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n; j++) {
                int product = 1;
                for (int k = i; k <= j ; k++) {
                    product = product * nums[k];
                }
                maxProduct = Math.max(maxProduct, product);
            }
        }
        System.out.println(maxProduct);
    }
}