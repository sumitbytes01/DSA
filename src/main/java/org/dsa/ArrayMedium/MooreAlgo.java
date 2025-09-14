package org.dsa.ArrayMedium;

public class MooreAlgo {
    public static void main(String[] args) {
        int nums[] = {3,2,3};
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
        System.out.println(element);
    }
}
