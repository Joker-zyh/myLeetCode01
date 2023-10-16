package com.yaheng.dp;

public class Solution04 {
    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length <= 2){
            return Math.min(cost[0], cost[1]);
        }
        //1.确定dp数组及其下标的含义
        //到达第i个台阶再往上爬需要的最小花费是dp[i]
        int[] dp = new int[cost.length];
        //2.递推公式
        //dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2])
        //3.初始化
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < dp.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[dp.length-1],dp[dp.length -2]);
    }
}
