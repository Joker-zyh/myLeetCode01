package com.yaheng.dp;

import java.util.Arrays;

public class Solution23 {
    public int coinChange(int[] coins, int amount) {
        // dp[j] 表示 装满背包容量为j的最少物品个数为 dp[j]
        int[] dp = new int[amount +1];

        //递推公式 dp[j] = Math.min(dp[j],dp[j-coins[i]] + 1)
        // 初始化
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        //遍历 先遍历物品
        for (int i = 0; i < coins.length; i++){
            for (int j = coins[i]; j <= amount;j++){
                if (dp[j - coins[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE? -1:dp[amount];
    }
}
