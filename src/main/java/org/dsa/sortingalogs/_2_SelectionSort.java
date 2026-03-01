package org.dsa.sortingalogs;

import java.util.Arrays;

public class _2_SelectionSort {
    public static void main(String[] args) {
        // pick minimum element from the unsorted array and swap
        // with the first element of the unsorted array
        int[] arr = {5, 2, 77, 9, 11, 88, 90, 1, 5, 7, 3, 68};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            // swap
            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
