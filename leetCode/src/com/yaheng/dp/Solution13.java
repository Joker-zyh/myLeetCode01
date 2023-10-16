package com.yaheng.dp;

import java.util.Arrays;

public class Solution13 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num :nums) {
            sum += num;
        }
        if (sum % 2 != 0){
            return false;
        }
        int bagWeight = sum / 2;
        int[] dp = new int[bagWeight + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagWeight; j >= nums[i];j--){
                dp[j] = Math.max(dp[j],dp[j - nums[i]] + nums[i]);
            }
        }
        if (dp[bagWeight] == bagWeight){
            return true;
        }
        return false;
    }
}
