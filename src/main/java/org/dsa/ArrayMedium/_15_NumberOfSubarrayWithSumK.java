package org.dsa.ArrayMedium;

import java.util.HashMap;
import java.util.Map;

public class _15_NumberOfSubarrayWithSumK {
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
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum+array[i];
            if(sum == k)
                count++;
            int rem = sum - k;
            if(map.containsKey(rem)){
                count = count+map.get(rem);
            }
            if(!map.containsKey(sum)){
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        System.out.println(count);
    }
}
