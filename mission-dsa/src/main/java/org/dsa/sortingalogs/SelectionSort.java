package org.dsa.sortingalogs;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // pick minimum element from the unsorted array and swap
        // with the first element of the unsorted array
        int[] arr = {5, 2, 77, 9, 11, 88, 90, 1, 5, 7, 3, 68};
        for (int i = 0; i < arr.length; i++) {
            // find min element index
            int minIdx = findMin(i, arr);
            // swap i and minIdx
            // only if they are different indexes
            if(i!=minIdx)
                swap(arr, i, minIdx);
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }

    private static int findMin(int i, int[] arr) {
        int minIdx = i;
        int minNum = Integer.MAX_VALUE;
        for (int j = i; j < arr.length; j++) {
            if(arr[j]<minNum){
                minIdx = j;
                minNum = arr[j];
            }
        }
    return minIdx;}
}
