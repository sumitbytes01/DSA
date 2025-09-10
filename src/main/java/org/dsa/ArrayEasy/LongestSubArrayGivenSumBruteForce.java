package org.dsa.ArrayEasy;

public class LongestSubArrayGivenSumBruteForce {
    public static void main(String[] args) {
        int gSum = 10;
        int array[] = {2, 3, 5, 1, 9};
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + array[k];
                }
                if (sum == gSum) {
                    int res = j - i + 1;
                    System.out.println("i is: " + i + " j is: " + j + " res is: " + res);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int j = i;
            for (j = i; j < n; j++) {
                sum = sum + array[j];
                if (sum == gSum) {
                    int res = j - i + 1;
                    System.out.println("i is: " + i + " j is: " + j + " res is: " + res);
                    break;
                }
                if (sum > gSum)
                    break;
            }
        }
    }
}
