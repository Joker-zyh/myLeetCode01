package com.yaheng.dp;

import java.util.Arrays;

public class Solution24 {
    public int numSquares(int n) {
        int length = getWeightLength(n);
        int[] num = new int[length];
        for (int i = 0; i < length; i++){
            num[i] = (i+1) * (i+1);
        }

        // dp[j] 表示和为j的完全平方数的最小数量为 dp[j]
        int[] dp = new int[n + 1];
        // 递推公式 dp[j] = Math.min(dp[j],dp[j-num[i]] + 1)
        // 初始化
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        //先遍历物品
        for (int i = 0; i < num.length;i++){
            for (int j = num[i]; j <= n;j++){
                dp[j] = Math.min(dp[j], dp[j-num[i]] + 1);
            }
        }
        return dp[n];
    }

    public int getWeightLength(int n){
        int i = 1;
        while (true){
            if (i*i > n){
                return --i;
            }
            i++;
        }
    }
}
