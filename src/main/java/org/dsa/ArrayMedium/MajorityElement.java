package org.dsa.ArrayMedium;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i] && j != i)
                    count++;
            }
            if (count>=n/2)
                System.out.println(nums[i]+" is the majority element");
        }
    }
    // another way could be using a hashmap and then checking on the values
}
