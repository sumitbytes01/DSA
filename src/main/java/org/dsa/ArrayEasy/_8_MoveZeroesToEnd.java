package org.dsa.ArrayEasy;

import java.util.Arrays;

public class _8_MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] input = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        //Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
        int i = 1,j=0;
        for (; i <input.length ; i++) {
            if(input[i] != 0){
                j++;
                input[j] = input[i];
                input[i] = 0;
            }
        }
        Arrays.stream(input).forEach(System.out::print);
    }
}
