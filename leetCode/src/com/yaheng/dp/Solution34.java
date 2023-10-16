package com.yaheng.dp;

public class Solution34 {
    public int maxProfit(int[] prices) {
        // 以下为一天的不同状态
        // 持有股票 昨天有 买入
        // 没有股票 昨天就没有 今天卖了
        int[][] dp = new int[prices.length][2];

        dp[0][0] = -prices[0];
        dp[0][1] = 0;

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] + prices[i]);
        }
        return dp[prices.length-1][1];
    }
}
