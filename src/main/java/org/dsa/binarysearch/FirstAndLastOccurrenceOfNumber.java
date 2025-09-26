package org.dsa.binarysearch;

public class FirstAndLastOccurrenceOfNumber {
    public static void main(String[] args) {
        int X = 3;
        int array[] = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int target = 3;
        int[] nums = {-1,-1};
        int idx1 = searchIdx(array,target,true);
        int idx2 = searchIdx(array,target,false);
        System.out.println(idx2-idx1+1);
    }

    private static int searchIdx(int[] array, int target, boolean isSearchFirst) {
        int l = 0;
        int r = array.length-1;
        int idx = -1;
        while (l<=r){
            int mid = l + (r-l)/2;
            if(array[mid] < target){
                l = mid+1;
            } else if (array[mid] > target) {
                r = mid -1;
            }
            else {
                idx = mid;
                if(isSearchFirst){
                    r = mid-1;
                }
                else
                    l = mid+1;
            }
        }
    return idx;}
}
