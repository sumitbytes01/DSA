package org.dsa.ArrayEasy;

import java.util.Arrays;

public class RightRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int d=2;
        int n = array.length;
        d = d%n;
        // Output:  3 4 5 6 7 1 2

        // temp array to story d places numbers
        int[] tempArr = new int[d];
        for (int i = 0; i<d ; i++) {
            tempArr[i] = array[i];
        }

        //move the array 2 places to the left
        for (int i = 0; i <n-d ; i++) {
            array[i] = array[i+d];
        }
        int count = 0;
        for (int i = n-d; i < n; i++) {
            array[i] = tempArr[count++];
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
