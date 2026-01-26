package org.dsa.ArrayEasy;

public class _12_FindNumberThatAppearsOnce {
    public static void main(String[] args) {
        optimumApproach();
        betterApproach(); // not a good approach when nos are negative
        // or in case of very big numbers
    }

    private static void betterApproach() {
        int arr[] = {4,1,2,1,2};
        int maxI = arr[0];
        for(int n: arr){
            maxI = Math.max(maxI, n);
        }
        int[] freqArray = new int[maxI+1];
        for (int i = 0; i < arr.length; i++) {
            freqArray[arr[i]]++;
        }
        for (int i = 0; i < freqArray.length; i++) {
            if(freqArray[i] == 1)
                System.out.println(i);
        }
    }

    private static void optimumApproach() {
        int arr[] = {4,1,2,1,2};
        int xor = 0;
        for(int num: arr){
            xor = xor^num;
        }
        System.out.println(xor);
    }
}
