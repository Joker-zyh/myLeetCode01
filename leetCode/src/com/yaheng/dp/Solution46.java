package com.yaheng.dp;

public class Solution46 {
    public int maxSubArray(int[] nums) {
        // dp[i] 表示包括nums[i]的最大连续子序列和
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < nums.length;i++){
            dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
