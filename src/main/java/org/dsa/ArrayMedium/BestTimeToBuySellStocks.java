package org.dsa.ArrayMedium;

public class BestTimeToBuySellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++){
            if (prices[i]<min)
                min = prices[i];
            maxProfit = Math.max(maxProfit,prices[i]-min);
        }
        System.out.println(maxProfit);
    }
}
