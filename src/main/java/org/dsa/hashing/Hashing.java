package org.dsa.hashing;

public class Hashing {
    public static void main(String[] args) {
        // hashing numbers
        int[] arr = {2,5,8,2,5,9};
        int maxNum = arr[0];
        for (int n: arr){
            if(maxNum<n)
                maxNum = n;
        }
        int[] freqArr = new int[maxNum+1];

        for (int n: arr){
            freqArr[n]++;
        }
        System.out.println("Frequency of 0: "+ freqArr[0]);
        System.out.println("Frequency of 2: "+ freqArr[2]);

        // hashing characters
        char[] charArr = {'f', 'a', 't', 'x', 'z', 'a', 't'};
        int[] freqCharArr = new int[26];
        for (char ch : charArr) {
            freqCharArr[ch - 'a']++;
        }

        System.out.println("Frequency of a: "+ freqCharArr['a' -'a']);
        System.out.println("Frequency of t: "+ freqCharArr['t' - 'a']);
        System.out.println("Frequency of z: "+ freqCharArr['z' - 'a']);
    }
}
