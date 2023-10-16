package com.yaheng.dp;

public class Solution01 {
    public int fib(int n) {
        if (n <= 1){
            return n;
        }
        //1.确定dp数组及下标的含义
        //第i个数的斐波那契数是dp[i]
        int[] dp = new int[n + 1];
        //2.递推公式
        //dp[i] = dp[i-1] + dp[i-2]
        //3.初始化
        dp[0] = 0;
        dp[1] = 1;
        //4.确定遍历顺序
        //dp[i] 依赖与 dp[i-1] && dp[i-2]，所以从前往后遍历
        //5.举例推导dp数组

        for (int i = 2;i <= n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
