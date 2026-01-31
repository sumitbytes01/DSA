package org.dsa.ArrayMedium;

import java.util.HashMap;
import java.util.Map;

public class _4_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        bruteForce(nums);
        betterApproach(nums);
        optimalApproach(nums);
    }

    private static void optimalApproach(int[] nums) {
        int count = 1;
        int element = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0)
                element = nums[i];
            if (nums[i] == element){
                count++;
            }
            else
                count--;
        }
        System.out.println("Majority element is: "+ element);
    }

    private static void betterApproach(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() >nums.length/2)
                System.out.println("Majority element is: "+ e.getKey());
        }
    }

    private static void bruteForce(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == nums[i])
                    count++;
            }
            if (count>=n/2)
            {
                System.out.println(nums[i]+" is the majority element");
                break;
            }
        }
    }
    // another way could be using a hashmap and then checking on the values
}
