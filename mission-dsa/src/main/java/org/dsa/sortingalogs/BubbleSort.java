package org.dsa.sortingalogs;

import java.util.Arrays;

public class BubbleSort {
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
    }

    private static void swapNums(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
