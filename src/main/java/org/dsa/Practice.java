package org.dsa;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    static void main() {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int givenSum = 15;
        int n = nums.length;
        // largest subarray with given sum
        // two pointer approach
        int end = 0;
        int start = 0;
        int sum = 0;
        int max = 0;
        while (end < n) {
            sum = sum + nums[end];
            while (sum > givenSum && start < n) {
                sum = sum - nums[start];
                start++;
            }
            if (sum == givenSum) {
                max = Math.max(end - start + 1, max);
                System.out.println(start + "-" + end + " Len: " + max);

            }
            end++;
        }
    }
}
