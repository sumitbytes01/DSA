package org.dsa.ArrayEasy;

import java.util.Arrays;

public class UnionSortedArray {
    public static void main(String[] args) {
        // add all elements to map, extra space
        // add all elements to set, extra space
        // array
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {2,3,4,4,5,7,9,11};
        int m = arr1.length;
        int n = arr2.length;
        int arr3[] = new int[m+n-1];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<m && j<n){
            while (i!=0 && arr1[i] == arr1[i-1] && i<m){
                i++;
            }
            while (j!=0 && arr2[j] == arr2[j-1] && j<n){
                j++;
            }
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;k++;
            } else if(arr1[i] > arr2[j]) {
                arr3[k] = arr2[j];
                j++;k++;
            }
            else {
                arr3[k] = arr2[j];
                j++;k++;i++;
            }
        }
        if(i<m){
            while (i<m){
                arr3[k] = arr1[i];
                i++;k++;
            }
        }
        if(j<n){
            while (j<n){
                arr3[k] = arr2[j];
                j++;k++;
            }
        }
        Arrays.stream(arr3).forEach(System.out::println);
    }
}
