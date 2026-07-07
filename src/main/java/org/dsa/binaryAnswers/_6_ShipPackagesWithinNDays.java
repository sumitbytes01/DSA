package org.dsa.binaryAnswers;

import java.util.Arrays;

public class _6_ShipPackagesWithinNDays {
    static void main() {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        System.out.println(bruteForceShip(weights, d));
        System.out.println(optimalSolutionShip(weights, d));
    }

    private static int optimalSolutionShip(int[] weights, int d) {
        int max = Arrays.stream(weights).max().getAsInt();
        int sum = Arrays.stream(weights).sum();
        int ans = max;
        while (max<=sum){
            int mid = max + (sum-max)/2;
            int daysReq = daysReq(mid, weights);
            if(daysReq<=d){
                sum = mid-1;
                ans = mid;
            }
            else max = mid+1;
        }
        return ans;
    }

    private static int bruteForceShip(int[] weights, int d) {
        int max = Arrays.stream(weights).max().getAsInt();
        int sum = Arrays.stream(weights).sum();
        for (int i = max; i <= sum; i++) {
            int days = daysReq(i, weights);
            if(days<=d)
                return i;
        }
        return -1;
    }

    private static int daysReq(int cap, int[] weights) {
        int load = 0;
        int day = 1;
        for (int i = 0; i < weights.length; i++) {
           if(load+weights[i]>cap){
               day++;
               load=weights[i];
           }
           else load = load+weights[i];

        }
    return day;
    }
}
