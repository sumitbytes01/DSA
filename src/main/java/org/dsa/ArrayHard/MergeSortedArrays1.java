package org.dsa.ArrayHard;

import java.util.Arrays;

public class MergeSortedArrays1 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int m = nums1.length;
        int[] nums2 = {2,5,6};
        int n = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums3 = new int[m+n];
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                nums3[k++] = nums1[i++];
            }
            else {
                nums3[k++] = nums2[j++];
            }
        }
        while(j<n){
            nums3[k++] = nums2[j++];
        }
        while(i<m){
            nums3[k++] = nums1[i++];
        }
        Arrays.stream(nums3).forEach(System.out::println);
        System.out.println("=================");

        for (int l = 0; l < m+n-1; l++) {
            if(l<n)
                nums1[l] = nums3[l];
            else
                nums2[l-n] = nums3[l];
        }
        Arrays.stream(nums1).forEach(System.out::println);
        System.out.println("=================");
        Arrays.stream(nums2).forEach(System.out::println);
    }
}
