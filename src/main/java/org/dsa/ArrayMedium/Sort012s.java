package org.dsa.ArrayMedium;

import java.util.Arrays;

public class Sort012s {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        //Output: [0,0,1,1,2,2]
        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        for (int num: nums){
            if(num == 0)
                zeroes++;
            else if (num == 1) {
                ones++;
            } else if (num == 2) {
                twos++;
            }
        }
        for (int i = 0; i < zeroes; i++) {
            nums[i] = 0;
        }
        for (int i = zeroes; i < zeroes+ones; i++) {
            nums[i] = 1;
        }
        for (int i = zeroes+ones; i < zeroes+ones+twos; i++) {
            nums[i] = 2;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
