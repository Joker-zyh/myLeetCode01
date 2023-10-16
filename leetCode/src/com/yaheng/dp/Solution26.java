package com.yaheng.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution26 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;

        for (int i = 1; i < s.length();i++){
            for (int j = 0;j < i && !dp[i];j++){
                if (set.contains(s.substring(j,i)) && dp[j]){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
