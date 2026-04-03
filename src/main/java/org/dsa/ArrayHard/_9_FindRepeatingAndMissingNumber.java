package org.dsa.ArrayHard;

import java.util.Arrays;

public class _9_FindRepeatingAndMissingNumber {
    public static void main(String[] args) {
        int array[] = {3,1,2,5,3};
        extremeBruteForce();
        bruteForce(array);
        hashing();
        int[] ans = mathematical();
        System.out.println(ans[0]+" "+ans[1]);
    }

    private static int[] mathematical() {
        int[] array = {3,1,2,5,3};
        int n = array.length;
        int sn =  n*(n+1)/2;
        int sn2 = n*(n+1)*(2*n+1)/6;

        int sum = 0;
        int squaresSum = 0;
        for(int i: array){
            sum = sum+i;
            squaresSum = squaresSum+i*i;
        }
        int val1 = sum -sn;
        int val2 = squaresSum - sn2;
        val2 = val2/val1;
        int x = (val1+val2)/2;
        int y = x-val1;
        return new int[]{x, y};
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
        int[] array = {3,1,2,5,4,6,7,5};
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
