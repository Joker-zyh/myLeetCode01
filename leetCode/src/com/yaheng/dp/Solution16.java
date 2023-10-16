package com.yaheng.dp;

public class Solution16 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num :nums) {
            sum += num;
        }
        if (target < 0 && sum < -target) return 0;
        if ((sum + target) % 2 == 1) return 0;
        int bagWeight = (sum + target)/2;
        int[] dp = new int[bagWeight + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length;i++){
            for (int j = bagWeight;j >= nums[i];j--){
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[bagWeight];
    }
}
