package org.dsa.binarysearch;

public class FloorAndCeiling {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {3, 4, 4, 7, 8, 10};
        int x= 5;
        int floor = Integer.MIN_VALUE;
        int ceiling = Integer.MAX_VALUE;
        // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<x && floor<arr[i])
                floor = arr[i];
            else if (arr[i]>x  && ceiling>arr[i]) {
                ceiling = arr[i];
            }
        }
        System.out.println("Floor id: "+floor+" Ceiling is: "+ceiling);
        // O(logn)
        int l = 0;
        int r = arr.length-1;
        floor = Integer.MIN_VALUE;
        ceiling = Integer.MAX_VALUE;
        while (l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]<x){
                floor = arr[mid];
                l = mid+1;
            } else if (arr[mid]>x) {
                ceiling = arr[mid];
                r = mid-1;
            }
        }
        System.out.println("Floor id: "+floor+" Ceiling is: "+ceiling);
    }
}
