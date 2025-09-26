package org.dsa.binarysearch;

public class UpperBound {
    public static void main(String[] args) {
        int arr[] = {3,5,8,9,15,19};
        int x = 9;
        // O(n)
        int num = arr[0];
        for (int i = 0; i <arr.length ; i++) {
           if(arr[i]>x)
           {
               num = arr[i];
               break;
           }
        }
        System.out.println(num);
    // O(logn)
        int nums[] = {3,5,8,9,15,19};
        int n = 9;
        int l = 0;
        int r = nums.length;
        while (l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>n){
                System.out.println(nums[mid]);
                r = mid-1;
            }
            else {
                l = mid+1;
            }
        }
    }
}
