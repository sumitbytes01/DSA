package org.dsa.binarysearch;

public class _12_SingleElementInSortedArray {
    public static void main() {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(findSingleElementBS(nums));
    }

    private static int findSingleElementBS(int[] nums) {

        int n = nums.length;
        if (nums.length == 1)
            return nums[0];
        else if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }
        int l = 1;
        int r = nums.length - 2;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1])
                return nums[mid];
            // left part has all pairs so ignore and let us look at the right half.
            else if (mid % 2 == 1 && nums[mid] == nums[mid - 1] ||
                    mid % 2 == 0 && nums[mid] == nums[mid + 1]) {
                l = mid + 1;
            }
            // right part has all pairs so ignore and let us look at the left half.
            else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
