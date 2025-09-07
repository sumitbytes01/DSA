package org.dsa.sortingalogs;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // divide and concur
        int[] arr = {5, 2, 77, 9, 11, 88, 90, 1, 5, 7, 3, 68};
        mergeSort(arr, 0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void mergeSort(int[] arr, int l, int h) {
        if(l<h){
            int mid = l+(h-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr, mid+1, h);
            merge(arr,l,mid,h);
        }
    }

    private static void merge(int[] arr, int l, int mid, int h) {
        int i = l;
        int j = mid+1;
        int k = 0;
        int[] tempArr = new int[h-l+1];
        while (i<=mid && j<=h){
            if(arr[i] < arr[j]){
                tempArr[k] = arr[i];
                i++;
                k++;
            }
            else {
                tempArr[k] = arr[j];
                j++;
                k++;
            }
        }
        if(i<=mid){
            while (i<=mid){
                tempArr[k] = arr[i];
                i++;
                k++;
            }
        }
        else {
            while (j<=h){
                tempArr[k] = arr[j];
                j++;
                k++;
            }
        }
        for (int m = 0; m < tempArr.length; m++) {
            arr[l + m] = tempArr[m];
        }
    }
}
