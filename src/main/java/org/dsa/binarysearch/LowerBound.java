package org.dsa.binarysearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] nums = {3,5,8,15,19};
        int x = 9;
        //find smallest index such that arr[idx] >= x.
        // O(n)
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=x)
            {
                System.out.println(i);
                break;
            }
        }
        System.out.println("======");
        // O(logn)
        int l = 0;
        int r = nums.length;
        while (l<=r){
            int mid = l+ (r-l)/2;
            if(nums[mid] >= x){
                System.out.println(mid);
                r = mid-1;

            } else if (nums[mid]<x) {
                l = mid+1;
            }
        }


    }
}
