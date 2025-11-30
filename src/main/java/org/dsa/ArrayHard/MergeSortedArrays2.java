package org.dsa.ArrayHard;

import java.util.Arrays;

public class MergeSortedArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int m = nums1.length;
        int[] nums2 = {2,5,6};
        int n = nums2.length;
        int i = m-1;
        int j = 0;
        int k = 0;
        while(i>=0 && j<n){
            if(nums1[i] > nums2[j]){
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i--;j++;
            }
            else {
                break;
            }
            Arrays.sort(nums1);
            Arrays.sort(nums2);
        }
        Arrays.stream(nums1).forEach(System.out::println);
        System.out.println("=================");
        Arrays.stream(nums2).forEach(System.out::println);
    }
}
