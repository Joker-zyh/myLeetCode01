package com.yaheng.dp;

import java.util.Arrays;

public class Solution41 {
    public int lengthOfLIS(int[] nums) {
        // dp[i] 是以nums[i]结尾子序列的最长子序列
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        int ans = 1;
        for (int i = 1; i < nums.length;i++){
            for (int j = 0; j < i;j++){
                if (nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
