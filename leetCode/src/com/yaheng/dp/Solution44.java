package com.yaheng.dp;

public class Solution44 {
    public int longestCommonSubsequence(String text1, String text2) {
        // dp[i][j] 表示 长度为i-1的text1与长度为j-1的text2的最长公共子序列。
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1;i <= text1.length();i++){
            for (int j = 1;j <= text2.length();j++){
                if (text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];


    }
}
