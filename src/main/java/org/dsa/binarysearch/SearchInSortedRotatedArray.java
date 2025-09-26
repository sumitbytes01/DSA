package org.dsa.binarysearch;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
         int[] nums ={4,5,6,7,0,1,2};
         int k = 1;
         int l = 0;
         int r = nums.length-1;
         while (l<=r){
             int mid = l+ (r-l)/2;
             if(nums[mid] == k)
                 System.out.println(mid);
             // left half is sorted
             if(nums[l]<=nums[mid]){
                if (k<=nums[mid] && k>=nums[l]){
                    r = mid-1;
                }
                else
                    l = mid+1;
             }
             // right half is sorted
             else {
                 if (k>=nums[mid] && k<=nums[r]){
                     l = mid+1;
                 }
                 else
                     r = mid-1;
             }
         }
    }
}
