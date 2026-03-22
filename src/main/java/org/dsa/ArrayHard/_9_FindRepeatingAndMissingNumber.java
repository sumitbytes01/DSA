package org.dsa.ArrayHard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRepeatingAndMissingNumber {
    public static void main(String[] args) {
        int array[] = {3,1,2,5,3};
        extremeBruteForce();
       // bruteForce(array);
        //hashing();
    }

    private static void extremeBruteForce() {
        int array[] = {3,1,2,5,3};
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int num = i;
            int count =0;
            for (int j = 0; j < n; j++) {
                if(array[j] == num)
                    count++;
            }
            if(count==2){
                System.out.println("Repeating number:"+num);
            } else if (count==0) {
                System.out.println("Missing number:"+num);
            }
        }
    }

    private static void hashing() {
        int array[] = {3,1,2,5,4,6,7,5};
        int n = array.length;
        int[] res = new int[n+1];
        for (int i = 0; i < n; i++) {
            res[array[i]] = res[array[i]]+1;
        }
        for (int i = 1; i < res.length; i++) {
            if(res[i] == 0)
                System.out.println("Missing number is: "+i);
            if(res[i] == 2)
                System.out.println("Repeated number is: "+i);
        }
    }

    private static void bruteForce(int[] array) {
        int n = array.length;
        Arrays.sort(array);
        for (int i = 1; i< n; i++) {
            if(array[i] == array[i-1])
                System.out.println("Repeated number: "+ array[i]);
            else if(array[i] != array[i-1]+1 ){
                System.out.println(array[i-1]+1+" : Missing number");
            }
        }
    }
}
