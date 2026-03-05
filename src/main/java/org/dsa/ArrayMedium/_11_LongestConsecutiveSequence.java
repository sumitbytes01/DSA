package org.dsa.ArrayMedium;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _11_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        bruteForce(nums); // O(n^2)
        betterApproach(nums); // O(nlogn)
        optimalApproach(nums);
    }

    private static void optimalApproach(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int maxCount = 0;
        for (int i = 0; i < len; i++) {
            int count = 0;
            int num = nums[i];
            if(set.contains(num - 1)){
                continue;
            } else {
                while (set.contains(num)){
                    count++;
                    num = num+1;
                }
                maxCount = Math.max(maxCount, count);

            }
        }
        System.out.println(maxCount);
    }

    private static void betterApproach(int[] nums1) {
        int[] nums = {1,0,1,2};
        Arrays.sort(nums);
        int longest = 1;
        int count = 1;
        for(int i = 1; i< nums.length; i++){
            if(nums[i-1] + 1 == nums[i])
            {
                count++;
                longest = Math.max(count, longest);
            }
            else if(nums[i-1] == nums[i])
            {
                count++;
                continue;
            }
            else
                count = 1;
        }
        System.out.println("Max count:: "+ longest);

    }

    private static void bruteForce(int[] nums) {
        int n = nums.length;
        int maxCount = 1;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int count = 1;
            for (int j = 0; j < n; j++) {
                if(nums[j] == num+1){
                    num++;
                    count++;
                    j=0;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        System.out.println(maxCount);
    }
}