package com.yaheng.dp;

public class Solution14 {
    public int lastStoneWeightII(int[] nums) {
        int sum = 0;
        for (int num :nums) {
            sum += num;
        }

        int bagWeight = sum / 2;
        int[] dp = new int[bagWeight + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagWeight; j >= nums[i];j--){
                dp[j] = Math.max(dp[j],dp[j - nums[i]] + nums[i]);
            }
        }
        return sum - dp[bagWeight]*2;
    }
}
