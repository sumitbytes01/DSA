package org.dsa.ArrayHard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _6_SubArraysWithGivenXor {
    public static void main(String[] args) {
        bruteForce();
        betterApproach();
        optimalApproach();
    }

    private static void optimalApproach() {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;
        List<List<Integer>> finalList = new ArrayList<>();
        // prefixXor -> list of indices where it occurred
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // XOR = 0 before array starts
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        int xor = 0;

        for (int i = 0; i < nums.length; i++) {

            xor ^= nums[i];

            int rem = xor ^ k;

            // If rem exists, all its indices form valid subarrays
            if (map.containsKey(rem)) {

                for (int startIndex : map.get(rem)) {

                    List<Integer> subArray = new ArrayList<>();

                    for (int j = startIndex + 1; j <= i; j++) {
                        subArray.add(nums[j]);
                    }

                    finalList.add(subArray);
                }
            }
            // Store current index for current XOR
            map.putIfAbsent(xor, new ArrayList<>());
            map.get(xor).add(i);
        }
        System.out.println(finalList);
        System.out.println("Count is : " + finalList.size());
    }


    private static void betterApproach() {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;
        int n = nums.length;
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum ^ nums[j];
                if (sum == k) {
                    List<Integer> list = new ArrayList<>();
                    for (int l = i; l <= j; l++) {
                        list.add((nums[l]));
                    }
                    finalList.add(list);
                }
            }
        }
        System.out.println(finalList);
        System.out.println("Count is : " + finalList.size());
    }

    private static void bruteForce() {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;
        int n = nums.length;
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum = sum ^ nums[l];
                }
                if (sum == k) {
                    List<Integer> list = new ArrayList<>();
                    for (int l = i; l <= j; l++) {
                        list.add((nums[l]));
                    }
                    finalList.add(list);
                }
            }
        }
        System.out.println(finalList);
        System.out.println("Count is : " + finalList.size());
    }
}