package org.dsa.binarysearch;

public class _4_SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int x = 7;
        bruteForce(arr, x);
        BinarySearchSolution(arr, x);
    }

    private static void BinarySearchSolution(int[] arr, int x) {
        // O(log n)
        int l = 0;
        int r = arr.length-1;
        int num = arr.length;
        while (l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid] >= x){
                num = mid;
                r = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        System.out.println(num);
    }

    private static void bruteForce(int[] arr, int x) {
        // O(n)
        int a = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= x){
                a = i;
            }
        }
        System.out.println("num is: "+a);
    }
}
