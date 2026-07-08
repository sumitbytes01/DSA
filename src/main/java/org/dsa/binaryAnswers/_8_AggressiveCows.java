package org.dsa.binaryAnswers;

import java.util.Arrays;

public class _8_AggressiveCows {
    static void main() {
        int[] stalls = {0,3,4,7,9,10};
        int k = 4;
        System.out.println(bruteCows(stalls, k));
        System.out.println(optimalCows(stalls, k));
    }

    private static int optimalCows(int[] stalls, int totalCows) {
        Arrays.sort(stalls);
        int min = 1;
        int max = stalls[stalls.length-1]-stalls[0];
        while (min<=max){
            int mid = min + (max-min)/2;
            boolean possible = canPlace(stalls, totalCows, mid);
            if(possible){
                min = mid+1;
            }
            else{
                max = mid-1;
            }
        }
        return max;
    }

    private static int bruteCows(int[] stalls, int totalCows) {
        Arrays.sort(stalls);
        int max = stalls[stalls.length-1]-stalls[0];
        int i = 1;
        for (; i <= max; i++) {
            boolean possible = canPlace(stalls, totalCows, i);
            if(!possible)
                break;
        }
        return i-1;
    }

    private static boolean canPlace(int[] stalls, int totalCows, int distance) {
        int currentCow = stalls[0];
        int count = 1;
        for (int j = 1; j < stalls.length; j++) {
            if(stalls[j]-currentCow>=distance){
                count++;
                currentCow = stalls[j];
                if(count==totalCows)
                    return true;
            }
        }
    return false;
    }
}
