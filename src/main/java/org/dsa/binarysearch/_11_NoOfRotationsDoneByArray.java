package org.dsa.binarysearch;

public class _11_NoOfRotationsDoneByArray {
    // index of min element = no of rotations done to the array

    static void main() {
        int l = 0;
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int r = nums.length-1;
        int minIdx = -1;
        int minNum = Integer.MAX_VALUE;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            //if left half is sorted
            if (nums[l] <= nums[mid]) {
               if(nums[l] < minNum){
                   minNum = nums[l];
                   minIdx = l;
               }
                l = mid + 1;
            } else {
                if(nums[mid] < minNum){
                    minNum = nums[mid];
                    minIdx = mid;
                }
                r = mid - 1;
            }
        }
        System.out.println(minIdx);
    }
}
