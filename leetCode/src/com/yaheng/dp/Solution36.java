package com.yaheng.dp;

public class Solution36 {
    public int maxProfit(int[] prices) {
        // 定义四种形态 0.第一次持有股票 1.第一次不持有股票 2.第二次持有股票 3.第二次不持有股票
        int[][] dp = new int[prices.length][4];

        dp[0][0] = -prices[0];
        dp[0][2] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i]);
            dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1] - prices[i]);
            dp[i][3] = Math.max(dp[i-1][3], dp[i-1][2] + prices[i]);
        }
        return dp[prices.length-1][3];
    }
}
