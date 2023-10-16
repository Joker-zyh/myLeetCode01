package com.yaheng.dp;

public class Solution06 {
    public int uniquePaths(int m, int n) {
        //1.确定dp数组及其下标意义
        //到达第[i,j]个位置有dp[i,j]条不同的路径
        int[][] dp = new int[m][n];
        //2.递推公式 dp[i,j] = dp[i-1][j] + dp[i][j-1]
        //3.初始化
        //第一行
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        //第一列
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        //4.从前往后，从上到下逐行遍历
        for (int i = 1;i < m;i++){
            for (int j = 1; j < n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
