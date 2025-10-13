package org.dsa.ArrayHard;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        bruteForce();
        betterApproach();
        optimalApproach();
    }

    private static void optimalApproach() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int n = nums.length;
        Set<List<Integer>> finalList = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i!=0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while (j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<0)
                    j++;
                else if (sum>0) {
                    k--;
                }
                else {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                    list.sort(Comparator.naturalOrder());
                    finalList.add(list);
                    j++;
                    k--;
                    // skip the duplicates
                    while (j<k && nums[j] == nums[j-1])
                        j++;
                    while (k != n-1 && j<k && nums[k] == nums[k+1])
                        k--;
                }
            }
        }
        System.out.println(finalList);
    }

    private static void betterApproach() {
        // O(n^2)
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int n = nums.length;
        Set<List<Integer>> finalList = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n; j++) {
                int target = -(nums[i] + nums[j]);
                if (map.containsKey(target) && map.get(target) != i && map.get(target) != j && i != j) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], target);
                    list.sort(Comparator.naturalOrder());
                    finalList.add(list);
                }
            }
        }
        System.out.println(finalList);
    }

    private static void bruteForce() {
        // O(n^3)
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Set<List<Integer>> finalList = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        list.sort(Comparator.naturalOrder());
                        finalList.add(list);
                    }
                }
            }
        }
        System.out.println(finalList);
    }
}
