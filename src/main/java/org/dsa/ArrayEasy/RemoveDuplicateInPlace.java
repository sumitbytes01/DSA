package org.dsa.ArrayEasy;

import java.util.Arrays;

public class RemoveDuplicateInPlace {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = 1;int j = 0;
        for (; i < nums.length; i++) {
            if(nums[i]!= nums[i-1]){
                j++;
                nums[j] = nums[i];
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
