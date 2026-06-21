package org.dsa.ArrayHard;

import java.util.Arrays;

public class _10_CountInversion {
    static void main() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5,4,3,2,1};
        bruteForce(array1);
        bruteForce(array2);
        System.out.println("============================");
        optimalApproach(array1);
        System.out.println("============================");
        optimalApproach(array2);
    }

    private static void optimalApproach(int[] array) {
        int count = mergeSort(array, 0, array.length-1);
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("============================");
        System.out.println(count);
    }

    private static int mergeSort(int[] array, int l, int r) {
        int count = 0;
        if(l<r){
          int mid = (l+r)/2;
          mergeSort(array, l, mid);
          mergeSort(array, mid+1, r);
          count = count + merge(l,mid,r, array);
        }
        return count;
    }

    private static int merge(int l, int mid, int r, int[] array) {
        int[] b = new int[r-l+1];
        int i = l;
        int j = mid+1;
        int k = 0;
        int count = 0;
        while(i<=mid && j <=r){
            if(array[i]>array[j]){
                b[k] = array[j];
                j++;
                count = count + r-l+1;
            } else{
                b[k] = array[i];
                i++;
            }
            k++;
        }
        if(i<=mid){
            while (i<=mid){
                b[k] = array[i];
                i++; k++;
            }
        }
        if(j<=r){
            while (j<=r){
                b[k] = array[j];
                j++; k++;
            }
        }
        for (int m = 0; m <b.length; m++) {
            array[m+l] = b[m];
        }
        return count;
    }

    private static void bruteForce(int[] array) {
        int n = array.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println("=============");
    }
}
