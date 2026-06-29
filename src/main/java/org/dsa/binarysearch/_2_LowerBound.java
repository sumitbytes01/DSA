package org.dsa.binarysearch;

public class _2_LowerBound {
    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 15, 19};
        int x = 9;
        // find the smallest index such that arr[idx] >= x.
        // O(n)
        linerSearch(nums, x);
        System.out.println("======");
        // O(logn)
        x = 9;
        binarySearch(nums, x);
    }

    private static void binarySearch(int[] nums, int x) {
        int l = 0;
        int r = nums.length - 1;
        int ans = nums.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= x) {
                ans = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        System.out.println(ans);
    }

    private static void linerSearch(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= x) {
                System.out.println(i);
                break;
            }
        }
    }
}
