package org.dsa.ArrayEasy;

import java.util.Arrays;

public class _5_LeftRotateArray1Place {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        //Output: 2,3,4,5,1
        int temp = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = temp;
        Arrays.stream(array).forEach(System.out::println);
    }
}
