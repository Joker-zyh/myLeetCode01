package com.yaheng.dp;

public class Solution37 {
    public int maxProfit(int k, int[] prices) { // k=3
        int width = 2*k + 1; // 7
        int[][] dp = new int[prices.length][width]; // 0不操作 1 2 3 4 5 6

        for (int i = 1; i < width; i += 2){
            dp[0][i] = -prices[0];
        }

        for (int i = 1; i < prices.length; i++){
            for (int j = 1; j < width; j += 2){
                dp[i][j] =  Math.max(dp[i-1][j],dp[i-1][j-1] - prices[i]);
                dp[i][j+1] = Math.max(dp[i-1][j+1], dp[i-1][j] + prices[i]);
            }
        }
        return dp[prices.length -1][width -1];
    }
}
