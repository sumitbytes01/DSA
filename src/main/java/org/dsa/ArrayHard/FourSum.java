package org.dsa.ArrayHard;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        bruteForce();
        betterSolution();
        optimalSolution();
    }

    private static void optimalSolution() {
        int nums[] = {1,0,-1,0,-2,2};
        int n = nums.length;
        Arrays.sort(nums);
        int target = 0;
        Set<List<Integer>> finalList = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(i !=0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j <n ; j++) {
                if(j != i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int l = j+1;
                int r = n-1;
                while (l<r){
                    int sum = nums[i] + nums[j] + nums[r] + nums[l];
                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i] , nums[j] , nums[l], nums[r]);
                        temp.sort(Comparator.naturalOrder());
                        finalList.add(temp);
                        l++;
                        r--;
                        while (l>r && nums[l] == nums[l-1])
                            continue;
                        while (l>r && nums[r] == nums[r+1])
                            continue;

                    } else if (sum<target) {
                        l++;
                    }
                    else r--;
                }
            }
        }
        System.out.println(finalList);
    }

    private static void betterSolution() {
        int nums[] = {1,0,-1,0,-2,2};
        int n = nums.length;
        int target = 0;
        Set<List<Integer>> finalList = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                Set<Integer> set = new HashSet<>();
                for (int k = j+1; k <n ; k++) {
                    int rem = target - (nums[i] + nums[j] + nums[k]);
                    if (set.contains(rem)){
                        List<Integer> temp = Arrays.asList(nums[i] , nums[j] , nums[k], rem);
                        temp.sort(Comparator.naturalOrder());
                        finalList.add(temp);
                    }
                    set.add(nums[k]);
                }
            }
        }
        System.out.println(finalList);
    }

    private static void bruteForce() {
        int nums[] = {1,0,-1,0,-2,2};
        int n = nums.length;
        int target = 0;
        Set<List<Integer>> finalList = new HashSet<>();
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k <n ; k++) {
                    for (int l = k+1; l <n ; l++) {
                        if(nums[i] + nums[j]+nums[k]+nums[l] == target){
                            finalList.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }
        System.out.println(finalList);
    }
}
