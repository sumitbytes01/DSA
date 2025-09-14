package org.dsa.ArrayMedium;

import java.util.Arrays;

public class ArrangeAlternatePositiveAndNegative {
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5};
        int n = arr.length;
        int res[] = new int[arr.length];
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
