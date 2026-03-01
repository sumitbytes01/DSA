package org.dsa.sortingalogs;

import java.util.Arrays;

public class _1_BubbleSort {
    public static void main(String[] args) {
        // sorting happens from the last of the array
        // after every iteration one element is sorted from last
        int[] arr = {5, 2, 77, 9, 11, 88, 90, 1, 5, 7, 3, 68};
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapNums(j, j + 1, arr);
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
        Arrays.stream(arr).forEach(System.out::println);
        int[] arr1 = {5, 2, 77, 9, 11, 88, 90, 1, 5, 7, 3, 68};
        bubbleSortRecursion(arr1, arr1.length);
        Arrays.stream(arr1).forEach(System.out::println);

    }

    private static void bubbleSortRecursion(int[] arr1, int length) {
        if (length == 1)
            return;
        boolean didSwap = false;
        for (int i = 0; i < length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                int temp = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = temp;
                didSwap = true;
            }
        }
        if (!didSwap)
            return;
        bubbleSortRecursion(arr1, length - 1);
    }
    private static void swapNums(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
