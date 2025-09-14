package org.dsa.ArrayMedium;

import java.util.Arrays;

public class DutchNationalFlagAlgo {
    public static void main(String[] args) {
        //0 to low-1 -> 0
        //low to mid-1 -> 1
        // mid to high -> unsorted
        // high+1 to n-1 -> 2 
        int nums[] = {2,0,1};
        //Output: [0,0,1,1,2,2]
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while (mid <= high){
            if(nums[mid] == 0){
                nums[mid] = nums[low];
                nums[low] = 0;
                mid++;low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
