package org.dsa.binaryAnswers;

import java.util.Arrays;

public class _4_MinDaysForBouquets {
    static void main() {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2, k = 3;
        //TC - O((min->max+1)*arr.length)
        System.out.println(bruteBouquets(arr, m, k));
        //TC - O(log(min->max+1)*arr.length)
        System.out.println(optimalBouquets(arr, m, k));
    }

    private static int optimalBouquets(int[] arr, int m, int k) {
        int totalFlowers = m * k;
        if (totalFlowers > arr.length)
            return -1;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int ans = 0;
        while (min<=max){
            int mid = min+(max-min)/2;
            int bouquets = possible(arr, k, mid);
            if (bouquets >= m){
                ans = mid;
                max = mid-1;
            }
            else min = mid+1;

        }
        return ans;
    }

    private static int possible(int[] arr, int k, int i) {
        int count = 0;
        int bouquets = 0;
        for (int flower : arr) {
            if (flower <= i) { // if jth days is less than= now day
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            }
            else count = 0;
        }
        return bouquets;
    }

    private static int bruteBouquets(int[] arr, int m, int k) {
        int totalFlowers = m * k;
        if (totalFlowers > arr.length)
            return -1;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        for (int i = min; i <= max; i++) {
            int bouquets = possible(arr, k, i);
            if (bouquets >= m)
                return i;
        }
        return -1;
    }
}
