package com.yaheng.dp;

public class Solution08 {
    public int integerBreak(int n) {
        //1.确定dp数组及其下标意义
        // i拆分后的最大积是dp[i]
        int[] dp = new int[n+1];
        //递推公式 dp[i] = Math.max(dp[i],Math.max(dp[i - j] * j, (i - j) * j))
        //初始化
        dp[2] = 1;
        for (int i = 3; i <= n;i++){
            for (int j = 1; j <= i/2; j++) {
                dp[i] = Math.max(dp[i],Math.max(dp[i - j] * j, (i - j) * j));
            }
        }
        return dp[n];
    }
}
