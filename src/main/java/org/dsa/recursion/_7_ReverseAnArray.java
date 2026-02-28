package org.dsa.recursion;

import java.util.Arrays;

public class _7_ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverseAnArray(arr);
        printArray(arr);
        System.out.println("===============");
        // reverseArrayRecursionParam(arr,l)
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        reverseArrayRecursionParam(arr1,0,arr1.length-1);
        printArray(arr1);
        System.out.println("==============");
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        reverseArrayRecursionSingleParam(arr2, 0, arr2.length);
        printArray(arr2);
        System.out.println("==============");
    }

    private static void reverseArrayRecursionSingleParam(int[] arr2, int i, int n) {
        if(i>n/2)
            return;
        swap(arr2, i,n-i-1);
        reverseArrayRecursionSingleParam(arr2, i+1, n);
    }

    private static void reverseArrayRecursionParam(int[] arr, int start, int end) {
        if(start>end)
            return;
        swap(arr,start,end);
        reverseArrayRecursionParam(arr, start+1, end-1);
    }

    private static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void reverseAnArray(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
