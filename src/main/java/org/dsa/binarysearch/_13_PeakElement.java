package org.dsa.binarysearch;

public class _13_PeakElement {
    static void main() {
        System.out.println(findPeakElement());
    }

    public static int findPeakElement() {
        int[] nums = {1,2,3,4,5,6,7,8,5,1};
        int n = nums.length;
        if (n == 1) return 0;
        // check first element
        if (nums[0] > nums[1]) return 0;
        // check last element
        if (nums[n - 1] > nums[n - 2]) return n - 1;
        int l = 1;
        int r = nums.length - 2;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}