package org.dsa.binarysearch;

public class _5_FloorAndCeiling {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int floor = Integer.MIN_VALUE;
        int ceiling = Integer.MAX_VALUE;
        bruteForceLinear(arr, x, floor, ceiling);
        floor = getFloorBS(arr, x);
        ceiling = getCeilingBS(arr, x);
        floor = floor == -1 ? -1 : arr[floor];
        ceiling = ceiling == -1 ? -1 : arr[ceiling];
        System.out.println(floor + " " + ceiling);
    }

    private static int getCeilingBS(int[] arr, int x) {
        int ceiling;
        int r;
        int l;
        // ceiling
        ceiling = -1;
        l = 0;
        r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] >= x) {
                ceiling = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        return ceiling;
    }

    private static int getFloorBS(int[] arr, int x) {
        int floor;
        // O(logn)
        if (arr.length == 0)
            System.out.println("Floor id: " + -1 + " Ceiling is: " + -1);
        // floor
        int l = 0;
        int r = arr.length - 1;
        floor = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= x) {
                floor = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }
        return floor;
    }

    private static void bruteForceLinear(int[] arr, int x, int floor, int ceiling) {
        // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x && floor < arr[i])
                floor = arr[i];
            /*if (arr[i] < x) {
                floor = Math.max(floor, arr[i]);
            }*/
            else if (arr[i] > x && ceiling > arr[i]) {
                ceiling = arr[i];
            }
            /*if (arr[i] > x) {
                ceiling = Math.min(ceiling, arr[i]);
            }*/
        }
        System.out.println("Floor id: " + floor + " Ceiling is: " + ceiling);
    }
}

