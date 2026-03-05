package org.dsa.ArrayMedium;

public class _6_KadanesWithArrayIdx {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-8,4};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start =0;
        int tempStart  =0;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            if(sum>max){
                max = sum;
                end = i;
                start = tempStart;
            }
            if(sum<0){
                sum = 0;
                tempStart = i+1;
            }
        }
        System.out.println(max+"Start: "+start+" End: "+end);}
}
