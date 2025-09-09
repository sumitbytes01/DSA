package org.dsa.ArrayEasy;

import java.util.Arrays;

public class LeftRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int d=2;
        int n = array.length;
        d = d%n;
        // Output: 6 7 1 2 3 4 5

        // temp array to story d places numbers
        int[] tempArr = new int[d];
        int count = 0;
        for (int i = n-d; i<n ; i++) {
            tempArr[count++] = array[i];
        }
        //move the array 2 places to the right
        for (int i = n-1; i >=2 ; i--) {
            array[i] = array[i-d];
        }
        for (int i = 0; i < d; i++) {
            array[i] = tempArr[i];
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
