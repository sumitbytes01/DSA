package org.dsa.binarysearch;

public class  _3_UpperBound {
    public static void main(String[] args) {
        int arr[] = {3,5,8,9,15,19};
        int x = 9;
        // O(n)
        int num = linear(arr, x);
        System.out.println(num);
        // O(logn)
        int nums[] = {3,5,8,9,15,19};
        int n = 9;
        num = binarySearch(nums, n);
        System.out.println(num);
    }

    private static int binarySearch(int[] nums, int n) {
        int num = -1;
        int l = 0;
        int r = nums.length-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]> n){
                num = nums[mid];
                r = mid-1;
            }
            else {
                l = mid+1;
            }
        }
    return num;
    }

    private static int linear(int[] arr, int x) {
        int num = -1;
        for (int j : arr) {
            if (j > x) {
                num = j;
                break;
            }
        }
        return num;
    }
}
