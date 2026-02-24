package org.dsa.ArrayMedium;

public class _7_BestTimeToBuySellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        bruteForce(prices);
        betterForce(prices);
    }

    private static void bruteForce(int[] prices) {
        int n = prices.length;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        System.out.println(maxProfit);
    }

    private static void betterForce(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++){
            if (prices[i]<min)
                min = prices[i];
            maxProfit = Math.max(maxProfit, prices[i]-min);
        }
        System.out.println(maxProfit);
    }
}
