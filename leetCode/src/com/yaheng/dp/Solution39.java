package com.yaheng.dp;

public class Solution39 {
    public int maxProfit(int[] prices, int fee) {
        // 0是持有股票 1是不持有股票
        int[][] dp = new int[prices.length][2];

        dp[0][0] = -prices[0];
        dp[0][1] = 0;

        for (int i = 1;i < dp.length;i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i] - fee);
        }

        return dp[prices.length -1][1];
    }
}
