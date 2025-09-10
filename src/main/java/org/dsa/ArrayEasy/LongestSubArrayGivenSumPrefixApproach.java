package org.dsa.ArrayEasy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayGivenSumPrefixApproach {
    public static void main(String[] args) {
        // prefix sum approach
        // keep storing the sum, as there could be the given sum in middle that can be
        // calculated by subtracting the sum from the start
        int gSum =6;
        int array[] = {2, 3, 5, 1, 9};
        int n = array.length;
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+array[i];
            if(sum == gSum) {
                max = Math.max(i+1, max);
            }
            int rem =  sum - gSum;
            if(prefixMap.containsKey(rem)){
                max = Math.max(max, i - prefixMap.get(rem));
            }
            if(!prefixMap.containsKey(sum)){
                prefixMap.put(sum, i);
            }
        }
        System.out.println(max);
    }
}
