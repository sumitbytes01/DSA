package org.dsa.binarysearch;

public class _6_FirstAndLastOccurrenceOfNumber {
    public static void main(String[] args) {
        int array[] = {2, 2, 3, 3, 3, 3, 4};
        int target = 3;
        int[] result = linearSerarch(array, target);
        System.out.println("First is: " + result[0] + " & Last is: " + result[1]);
        result = binarySolution(array, target);
    }

    private static int[] binarySolution(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        // lower bound - first occurence
        int first = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                first = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        // upper bound = last occurence
        l = 0;
        r = nums.length - 1;
        int last = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                last = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }
        if (first == -1 || nums[first] != target) first = -1;
        if (last == -1 || nums[last] != target) last = -1;
        return new int[]{first, last};
    }

private static int[] linearSerarch(int[] array, int target) {
    int first = -1;
    int last = -1;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            if (first == -1)
                first = i;
            last = i;
        }
    }
    return new int[]{first, last};
}
}