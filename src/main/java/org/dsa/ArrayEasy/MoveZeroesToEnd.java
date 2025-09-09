package org.dsa.ArrayEasy;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] input = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        //Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
        int i = 0,j=0;
        for (; i <input.length ; i++) {
            if(input[i] != 0){
                int temp = input[j];
                input[j] = input[i];
                j++;
                input[i] = temp;
            }
        }
        Arrays.stream(input).forEach(System.out::println);
    }
}
