package com.yaheng.dp;

public class Solution22 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        //先遍历背包
        for (int i = 1; i <= n;i++){
            for (int j = 1; j <= n;j++){
                if (i - j >= 0){
                    dp[i] += dp[i - j];
                }
            }
        }
        return dp[n];

    }
}
