package org.dsa.LeetCodeArrays;

import java.util.Arrays;

public class _1_OnePlus {
    static void main() {
        int arr[] = {1, 2, 3};
        addOne(arr);
        arr = new int[]{1, 2, 9};
        addOne(arr);
        arr = new int[]{9, 9, 9};
        addOne(arr);
    }

    private static int[] addOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] = arr[i] + 1;
                printArray(arr);
                return arr;
            }
            arr[i] = 0;
        }
        arr = new int[arr.length + 1];
        arr[0] = 1;
        printArray(arr);
        return arr;
    }

    private static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("===============");
    }
}
