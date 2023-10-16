package com.yaheng.dp;

public class Solution07 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //1.确定dp数组及其下标意义
        //到达第[i,j]个位置有dp[i,j]条不同的路径
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        //2.递推公式 dp[i,j] = dp[i-1][j] + dp[i][j-1]
        //3.初始化
        //第一行
        for (int i = 0; i < dp[0].length; i++) {
            if (obstacleGrid[0][i] == 1){
                break;
            }
            dp[0][i] = 1;
        }
        //第一列
        for (int i = 0; i < dp.length; i++) {
            if (obstacleGrid[i][0] == 1){
                break;
            }
            dp[i][0] = 1;
        }

        //逐行遍历
        for (int i = 1; i < dp.length;i++){
            for (int j =1; j < dp[0].length;j++){
                if (obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
