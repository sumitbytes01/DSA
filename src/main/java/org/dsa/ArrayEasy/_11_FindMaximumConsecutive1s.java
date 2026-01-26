package org.dsa.ArrayEasy;

public class _11_FindMaximumConsecutive1s {
    public static void main(String[] args) {
        int[] prices = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] == 1){
                count ++;
                max = Math.max(max, count);
            }
            else
                count = 0;

        }
        System.out.println(max);}
}
