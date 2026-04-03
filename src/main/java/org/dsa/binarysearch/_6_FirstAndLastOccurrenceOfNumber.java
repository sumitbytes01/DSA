/*
package org.dsa.binarysearch;

public class _6_FirstAndLastOccurrenceOfNumber {
    public static void main(String[] args){
        int array[] = {2, 2, 3, 3, 3, 3, 4};
        int target = 3;
        int[] result = linearSerarch(array, target);
        System.out.println("First is: "+result[0]+" & Last is: "+result[1]);
        result = binarySolution(array, target);
    }

    private static int[] binarySolution(int[] array, int target) {
        // lower bound will give first
        int l = 0;
        int r = array.length-1;
        int first = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(array[mid]>=target){
                first = mid;
            }
        }
    }

    private static int[] linearSerarch(int[] array, int target) {
        int first = -1; int last = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                if(first == -1)
                    first = i;
                last = i;
            }
        }
    return new int[]{first, last};}
}
*/
