package org.dsa.ArrayEasy;

import java.util.Arrays;

public class LeftRotateArray1Place {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        //Output: 2,3,4,5,1
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length-1] = temp;
        Arrays.stream(array).forEach(System.out::println);
    }
}
