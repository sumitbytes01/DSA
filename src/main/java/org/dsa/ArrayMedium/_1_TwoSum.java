package org.dsa.ArrayMedium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,11};
        int target  = 14;
        int[] res = bruteForce(arr, target);
        int[] res1 = BetterSolution(arr, target);
        int[] res2 = OptimalSolution(arr, target);
        Arrays.stream(res).forEach(System.out::println);
        Arrays.stream(res1).forEach(System.out::println);
        Arrays.stream(res2).forEach(System.out::println);
    }

    private static int[] OptimalSolution(int[] arr, int target) {
        // array must be sorted
        int l = 0;
        int r = arr.length-1;
        while (l<=r){
            if(arr[l] + arr[r] == target)
                return new int[]{l,r};
            else if (arr[l] + arr[r] < target) {
                l++;
            }
            else r--;
        }
        return null;
    }

    private static int[] BetterSolution(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target - arr[i])){
                return new int[]{map.get(target - arr[i]), i};
            }
            else
                map.put(arr[i], i);
        }
        return null;
    }

    private static int[] bruteForce(int[] arr, int target){
        for(int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
    return null;
    }
}
