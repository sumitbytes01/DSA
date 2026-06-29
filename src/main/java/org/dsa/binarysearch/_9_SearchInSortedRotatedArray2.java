package org.dsa.binarysearch;

public class _9_SearchInSortedRotatedArray2 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                System.out.println("TRUE");

            // ignore duplicates if (arr[l] == arr[mid] == arr[r])
            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                l = l + 1;
                r = r - 1;
                continue;
            }
            // check if left half is sorted
            if (nums[l] <= nums[mid]) {
                // check if number lies in the sorted left half
                if (target >= nums[l] && target <= nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            // right half is sorted
            else {
                if (target >= nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        System.out.println("FALSE");
    }
}