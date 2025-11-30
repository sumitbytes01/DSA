package org.dsa.ArrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubArraysWithGivenXor {
    public static void main(String[] args) {
        bruteForce();
        betterApproach();
        optimalApproach();
    }

    private static void optimalApproach() {
        {
            int[] nums = {4, 2, 2, 6, 4};
            int k = 6;
            int n = nums.length;
            List<List<Integer>> finalList = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum ^ nums[i];
                if (sum == k){
                    List<Integer> list = new ArrayList<>();
                    for (int l = 0; l <= i; l++) {
                        list.add((nums[l]));
                    }
                    finalList.add(list);
                }
                if(map.containsKey(sum)){
                    List<Integer> list = new ArrayList<>();
                    int j = map.get(sum);
                    for (int l = j; l <= i; l++) {
                        list.add((nums[l]));
                    }
                    //finalList.add(list);
                }
                else {
                    map.put(sum, i);
                }
            }
            System.out.println(finalList);
            System.out.println("Count is : "+finalList.size());
        }
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
                if (sum == k){
                    List<Integer> list = new ArrayList<>();
                    for (int l = i; l <= j; l++) {
                        list.add((nums[l]));
                    }
                    finalList.add(list);
                }
            }
        }
        System.out.println(finalList);
        System.out.println("Count is : "+finalList.size());
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
                if (sum == k){
                    List<Integer> list = new ArrayList<>();
                    for (int l = i; l <= j; l++) {
                        list.add((nums[l]));
                    }
                    finalList.add(list);
                }
            }
        }
        System.out.println(finalList);
        System.out.println("Count is : "+finalList.size());
    }
}