package org.dsa.binarysearch;

public class _12_SingleElementInSortedArray {
    public static void main() {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int l = 1;
        int r = nums.length - 2;
        if (nums.length == 1 || nums[0] != nums[1])
            System.out.println(nums[0]);
        if (nums[nums.length - 1] != nums[nums.length - 2])
            System.out.println(nums.length - 1);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1])
                System.out.println(nums[mid]);
            else if (mid % 2 == 1 && nums[mid] == nums[mid - 1] ||
                    mid % 2 == 0 && nums[mid] == nums[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
