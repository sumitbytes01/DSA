package org.dsa.sortingalogs;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // array is divided into sorted and unsorted parts
        // one element is picked from the unsorted array and put in the correct place of the sorted array
        int[] arr = {5, 2, 77, 9, 11, 88, 90, 1, 5, 7, 3, 68};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
