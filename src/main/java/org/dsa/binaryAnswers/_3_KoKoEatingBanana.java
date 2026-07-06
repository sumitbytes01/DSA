package org.dsa.binaryAnswers;

import java.util.Arrays;

public class _3_KoKoEatingBanana {
    static void main() {
        int[] arr = {7, 15, 6, 3};
        int h = 8;
        System.out.println(bruteEating(arr, h));
        arr = new int[]{25, 12, 8, 14, 19};
        h = 5;
        System.out.println(bruteEating(arr, h));
        System.out.println("=========================");
        arr = new int[]{7, 15, 6, 3};
        h = 8;
        System.out.println(optimalEating(arr, h));
        arr = new int[]{25, 12, 8, 14, 19};
        h = 5;
        System.out.println(optimalEating(arr, h));
    }

    private static int bruteEating(int[] arr, int h) {
        int max = Arrays.stream(arr).max().getAsInt();
        for (int i = 1; i <= max; i++) {
            long totalHours = 0;
            for(int j = 0; j< arr.length; j++){
                totalHours += (int) Math.ceil((double)arr[j]/i);
            }
            if(totalHours<=h){
                return i;
            }
        }
        return -1;
    }

    private static int optimalEating(int[] arr, int h) {
        int max = Arrays.stream(arr).max().getAsInt();
        int l = 1;
        int ans = -1;
        while(l<=max){
            int mid = l + (max-l)/2;
            int totHours = 0;
            for (int i = 0; i < arr.length; i++) {
                totHours += (int)Math.ceil((double) arr[i]/mid);
            }
            if(totHours<=h){
                ans = mid;
                max = mid-1;
            }
            else
                l = mid+1;
        }
    return ans;
    }
}
