package org.dsa.binaryAnswers;

import java.util.Arrays;

public class _5_SmallestDivisorGivenThreshold {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        // Brute: O(n×max(arr))
        // Optimal: O(nlog(max(arr)))
        System.out.println(brute(arr, limit));
        System.out.println(optimalSolution(arr, limit));
    }

    private static int optimalSolution(int[] arr, int limit) {
        int l = 1;
        int r = Arrays.stream(arr).max().getAsInt();
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int sum = getSum(mid, arr);
            if (sum <= limit) {
                ans = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        return ans;
    }

    private static int getSum(int divisor, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (int) Math.ceil((double) arr[i] / divisor);
        }
        return sum;
    }

    private static int brute(int[] arr, int limit) {
        int max = Arrays.stream(arr).max().getAsInt();
        for (int i = 1; i <= max; i++) {
            int tempSum = 0;
            for (int j = 0; j < arr.length; j++) {
                tempSum += (int) Math.ceil((double) arr[j] / i);
            }
            if (tempSum <= limit) {
                return i;
            }
        }
        return -1;
    }
}
