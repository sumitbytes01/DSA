package org.dsa.ArrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _11_ReversePairs {
    static void main() {
        List<int[]> list = bruteForce();
        printList(list);
        System.out.println("=================");
        optimalMergeSortSolution();
    }

    private static void optimalMergeSortSolution() {
        int[] array = {1,3,2,3,1};
        int n = array.length;
        int count = mergeSort(0, array.length-1, array);
        System.out.println("Number of elements: "+count);
    }

    private static int mergeSort(int l, int r, int[] array) {
        int count = 0;
        if(l<r){
            int mid = (l+r)/2;
            count += mergeSort(l, mid, array);
            count += mergeSort(mid+1, r, array);
            count += countPairs(array, l, mid, r); //Modification
            merge(l, mid, r, array);
            System.out.println("==============================");
            Arrays.stream(array).forEach(System.out::println);
        }
        return count;
    }

    private static int countPairs(int[] array, int l, int mid, int r) {
        int count = 0;
        int j = mid+1;
        for (int i = l; i <= mid; i++) {
            while (j<=r && array[i]>2*array[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        return count;
    }

    private static void merge(int l, int mid, int r, int[] array) {
        int i = l;
        int j = mid+1;
        int k = 0;
        int[] b = new int[r-l+1];
        while(i<=mid && j<=r){
            if(array[i]<array[j]){
                b[k] = array[i];
                i++;
            }
            else{
                b[k] = array[j];
                j++;
            }
            k++;
        }
        if(i<=mid){
            while (i<=mid){
                b[k] = array[i];
                i++;
                k++;
            }
        }
        if(j<=r){
            while (j<=r){
                b[k] = array[j];
                j++;
                k++;
            }
        }
        for (int m = 0; m < b.length; m++) {
            array[l+m] = b[m];
        }
    }

    private static void printList(List<int[]> list) {
        // Method 1: Print each pair on a separate line
        System.out.println("Reverse Pairs:");
        for (int[] pair : list) {
            System.out.println(Arrays.toString(pair));
        }

        // Method 2: Print all pairs in one line
        System.out.println("\nAll pairs: " + Arrays.deepToString(list.toArray()));
    }

    private static List<int[]> bruteForce() {
        // i<j and array[i] > 2* array[j]
        int[] array = {1,3,2,3,1};
        int n = array.length;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(array[i] > 2 * array[j]){
                    list.add(new int[]{array[i], array[j]});
                }
            }
        }
        return list;
    }
}
