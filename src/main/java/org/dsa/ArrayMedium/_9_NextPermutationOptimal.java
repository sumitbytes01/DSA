package org.dsa.ArrayMedium;

import java.util.Arrays;

public class _9_NextPermutationOptimal {
    public static void main(String[] args) {
        //Traverse from the end and find the first index where the current digit is smaller than the next one (this is the "breaking point").
        //Then again traverse from the end to find the first digit greater than the breaking point digit and swap them.
        //Finally, reverse the part of the array to the right of the breaking point to get the smallest next permutation.
        //If no such breaking point exists (entire array is descending), just reverse the whole array.
        int[] arr = {2,1,5,4,3,0,0};
        int n = arr.length;

        //Traverse from the end and find the first index where the current digit is smaller than the next one (this is the "breaking point").
        int pivotElement = -1;
        int pivotIdx = -1;
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivotIdx = i;
                pivotElement = arr[i];
                System.out.println("Pivot index is: "+i+" and pivot element is: "+arr[i]);
                break;
            }
        }

        //If no such breaking point exists (entire array is descending), just reverse the whole array.
        if(pivotIdx == -1){
            int l = 0;
            int r = n;
            while (l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--; l++;
            }
        }

        //Then again traverse from the end to find the first digit greater than the breaking point digit and swap them.
        int swapElementIdx = -1;
        for(int i = n-1;i>=0;i--) {
            if (arr[i] > pivotElement) {
                swapElementIdx = i;
                System.out.println("Swap element is: " + arr[i]);
                int temp = arr[pivotIdx];
                arr[pivotIdx] = arr[swapElementIdx];
                arr[swapElementIdx] = temp;
                break;
            }
        }
        //Finally, reverse the part of the array to the right of the breaking point to get the smallest next permutation.
        int l = pivotIdx+1;
        int r = n-1;
        while (l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;
        }
        Arrays.stream(arr).forEach(System.out::println);}
}
