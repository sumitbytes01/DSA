package org.dsa.ArrayMedium;

import java.util.Arrays;

public class _8_ArrangeAlternatePositiveAndNegative {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,-5};
        bruteForce(arr);
        betterApproach(arr);
    }

    private static void bruteForce(int[] arr) {
        int[] pos = new int[(arr.length)/2];
        int[] neg = new int[(arr.length)/2];
        int posIxd = 0;
        int negIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                neg[negIdx++] = arr[i];
            }
            else
                pos[posIxd++] = arr[i];
        }
        for (int i = 0; i < arr.length/2; i++) {
            arr[2*i]  = pos[i];
            arr[2*i + 1] = neg[i];
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void betterApproach(int[] arr) {
        int n = arr.length;
        int[] res = new int[arr.length];
        int posIdx = 0;
        int negIdx = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i]<0)
            {
                res[negIdx] = arr[i];
                negIdx = negIdx+2;
            }
            else
            {
                res[posIdx] = arr[i];
                posIdx = posIdx+2;
            }
        }
        Arrays.stream(res).forEach(System.out::println);
    }
}
