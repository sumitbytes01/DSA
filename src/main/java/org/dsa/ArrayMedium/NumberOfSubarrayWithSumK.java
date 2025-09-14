package org.dsa.ArrayMedium;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubarrayWithSumK {
    public static void main(String[] args) {
        int array[] = {3, 1, 2, 4};
        int k = 6;
        int n = array.length;
        int count = 0;
        // n^3
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum = sum+array[l];
                }
                if(sum == k)
                    count++;
            }
        }
        System.out.println(count);

        // n^2
        count =0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum+array[j];
                if(sum == k)
                    count++;
            }

        }
        System.out.println(count);
        count = 0;
        // prefix sum
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // To account for subarrays starting at index 0
        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}
