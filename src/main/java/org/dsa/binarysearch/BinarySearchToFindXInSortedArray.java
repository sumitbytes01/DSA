package org.dsa.binarysearch;

public class BinarySearchToFindXInSortedArray {
    public static void main(String[] args) {
        // iterative implementation
        iterativeImplementation();
        int[] nums = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int l = 0;
        int r = nums.length;
        System.out.println(recursiveImplementation(nums, l, r, target));
    }

    private static int recursiveImplementation(int[] nums, int l, int r, int target) {
        if (l > r)
            return -1;
        int mid = l + (r - l) / 2;
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] < target)
            return recursiveImplementation(nums, mid + 1, r, target);
        else
            return recursiveImplementation(nums, l,mid - 1, target);
    }

    private static void iterativeImplementation() {
        //O(logN)
        int[] nums = {3, 4, 6, 7, 9, 12, 16, 17};
        int n = nums.length;
        int target = 6;
        int l = 0;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                System.out.println("Index is " + mid);
            if (nums[mid] < target) {
                l = mid + 1;
            } else
                r = mid - 1;
        }
    }
}
