package com.yaheng.dp;

public class Solution47 {
    public boolean isSubsequence(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 1; i <= s.length();i++){
            for (int j = 1; j <= t.length();j++){
                if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        if (dp[s.length()][t.length()] == s.length()){
            return true;
        }
        return false;

        /*int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 1; i <= s.length();i++){
            for (int j = 1; j <= t.length();j++){
                if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        if (dp[s.length()][t.length()] == s.length()){
            return true;
        }else {
            return false;
        }*/
    }
}
