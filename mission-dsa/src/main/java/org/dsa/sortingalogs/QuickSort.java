package org.dsa.sortingalogs;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // pick a pivot element. 1st position index.
        // find its place in the array, by using i and j such that pivot is greater than i and smaller than j
        // swap the number as ith and jth index till i<j
        // if so swap pivot position and jth position elements
        // one number is at its correct position if this activity is done.
        // this is known as partition logic.

        // repeat this by breaking the array into pieces after finding the element.
        int[] arr = {5, 2, 77, 9, 11, 88, 90, 1, 5, 7, 3, 68};
        quickSort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void quickSort(int[] arr, int l, int h) {
        if(l<h){
            int pivot = partitioningLogic(arr, l, h);
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,h);
        }
    }

    private static int partitioningLogic(int[] arr, int i, int j) {
        int pivot = arr[i];
        int l = i;
        while (i<=j){
            while (pivot>=arr[i])
                i++;
            while (pivot<arr[j])
                j--;
            if(i<j)
                swapNums(i,j,arr);
        }
        swapNums(j,l,arr);
        return j;
    }
    private static void swapNums(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
