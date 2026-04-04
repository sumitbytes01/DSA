package org.dsa.binarysearch;

public class _8_SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                System.out.println(mid);
            // check if left half sorted
            if (nums[l] <= nums[mid]) {
                if ((nums[l] <= target && nums[mid] > target)) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            // else if right half is sorted
            else {
                if ((nums[mid] < target && nums[r] >= target)) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        System.out.println(-1);
    }
}