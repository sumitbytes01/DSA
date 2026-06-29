package org.dsa.binarysearch;

public class _10_FindMinSortedRotatedArray {
    static void main() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int l = 0;
        int r = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(l<=r){
            // if already sorted
            if (nums[l] <= nums[r]) {
                min = Math.min(min, nums[l]);
                break;
            }
            int mid = l + (r-l)/2;
            // if left half is sorted
            if(nums[l]<=nums[mid]){
                min = Math.min(min, nums[l]);
                l = mid+1; // since the actual minimum could be on the other half.
            }
            // else if right half is sorted
            else{
                min = Math.min(min, nums[mid]);
                r = mid-1;
            }
        }
        System.out.println(min);
    }
}
