package org.dsa.binaryAnswers;

import java.util.Arrays;

public class _10_SplitArrayLargestSum {
    static void main() {
        int[] array = {1,2,3,4,5};
        int splits = 3;
        System.out.println(bruteForceSplit(array, splits));
        System.out.println(optimalSplit(array, splits));
    }

    private static int optimalSplit(int[] array, int splits) {
        if(splits> array.length)
            return -1;
        int min = Arrays.stream(array).max().getAsInt();
        int max = Arrays.stream(array).sum();
        while(min <= max){
            int mid = min + (max-min)/2;
            boolean isPossibleSplit = isPossibleSplit(array, splits, mid);
            if(isPossibleSplit){
                max = mid-1;
            }
            else
                min = mid+1;
        }
    return min;
    }

    private static int bruteForceSplit(int[] array, int splits) {
        if(splits> array.length)
            return -1;
        int min = Arrays.stream(array).max().getAsInt();
        int max = Arrays.stream(array).sum();
        for (int i = min; i <= max ; i++) {
            boolean isPossibleSplit = isPossibleSplit(array, splits, i);
            if(isPossibleSplit)
                return i;
        }
    return -1;
    }

    private static boolean isPossibleSplit(int[] array, int splits, int maxSum) {
        int currSum = 0;
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if(currSum+array[i]<=maxSum){
                currSum += array[i];
            }
            else{
                count++;
                currSum = array[i];
                if(count>splits)
                    return false;
            }
        }
    return true;
    }
}
