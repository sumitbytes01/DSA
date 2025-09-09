package org.dsa.ArrayEasy;

import java.util.Arrays;

public class ArrayRotateByReversingArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n = array.length;
        d = d % n;
        // Output:  3 4 5 6 7 1 2
        reverseArray(array, 0, array.length - 1);
        reverseArray(array, 0, array.length - 1 - d);
        reverseArray(array, array.length - d, array.length - 1);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void reverseArray(int[] array, int i, int j) {
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
