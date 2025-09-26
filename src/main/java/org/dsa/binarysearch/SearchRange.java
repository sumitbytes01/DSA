package org.dsa.binarysearch;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                ans[0] = i;
                while (i < nums.length && nums[i] == target) {
                    ans[1] = i;
                    i++;
                }
                break;
            }
        }
        Arrays.stream(ans).forEach(System.out::println);
        // O(logn)
        int[] array = {5,7,7,8,8,10};
        int targeta = 8;
        ans[0] = search(array, true, targeta);
        ans[1] = search(array, false, targeta);
        Arrays.stream(ans).forEach(System.out::println);
    }

    private static int search(int[] array, boolean isSearchLeft, int target) {
        int l = 0;
        int r = array.length - 1;
        int idx = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (array[mid] < target) {
                l = mid + 1;
            } else if (array[mid] > target) {
                r = mid - 1;
            } else {
                idx = mid;
                if (isSearchLeft) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return idx;
    }
}
