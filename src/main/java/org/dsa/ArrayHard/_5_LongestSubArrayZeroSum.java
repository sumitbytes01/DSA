package org.dsa.ArrayHard;

import java.util.HashMap;

public class _5_LongestSubArrayZeroSum {
    public static void main(String[] args) {
        bruteForce();
        betterApproach();
        // prefix sum
        optimalApproach();
    }

    private static void optimalApproach() {
        int n = 6;
        int[] array = {9, -3, 3, -1, 6, -5};
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+array[i];
            if(sum == 0)
                maxLen = Math.max(maxLen, i+1);
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i-map.get(sum));
            }
            else
                map.put(sum, i);
        }
        System.out.println(maxLen);
    }

    private static void betterApproach() {
        int n = 6;
        int[] array = {9, -3, 3, -1, 6, -5};
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + array[j];
                if(sum == 0)
                    maxLen = Math.max(maxLen, j-i+1);
            }
        }
        System.out.println(maxLen);
    }

    private static void bruteForce() {
        int n = 6;
        int[] array = {9, -3, 3, -1, 6, -5};
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + array[k];
                }
                if(sum == 0)
                    maxLen = Math.max(maxLen, j-i+1);
            }
        }
        System.out.println(maxLen);}
}
