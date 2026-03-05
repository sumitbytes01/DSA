package org.dsa.ArrayMedium;

import java.util.Arrays;

public class _9_NextPermutationOptimal_new {
    public static void main(String[] args) {
        int[] nums = {2,1,5,4,3,0,0};
        int n = nums.length;

        int pivotElement = -1;
        int pivotIdx = -1;
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i] < nums[i+1]){
                pivotIdx = i;
                pivotElement = nums[i];
                System.out.println("pivot index is: "+pivotIdx+" and pivot element is: "+ pivotElement);
                break;
            }
        }
        for(int i = n-1; i> pivotIdx;i--){
            if(nums[i]>pivotElement){
                int temp = nums[i];
                nums[i] = pivotElement;
                nums[pivotIdx] = temp;
                break;
            }
        }
        reverse(nums, pivotIdx+1, n-1);
        Arrays.stream(nums).forEach(System.out::println);}
    public static void reverse(int[] nums, int l, int r){
        while (l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;r--;
        }
    }
}
