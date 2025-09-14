package org.dsa.ArrayMedium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max = 0;
        for (int num: nums){
            if(!set.contains(num-1)){
                int count = 1;
                while (set.contains(num+1)) {
                    count++;
                    num = num+1;
                }
            max = Math.max(count, max);
            }
        }
    }
}