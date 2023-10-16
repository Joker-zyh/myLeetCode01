package com.yaheng.dp;

import java.util.Arrays;

public class Solution42 {
    public int findLengthOfLCIS(int[] nums) {
        //dp[i] 表示以nums[i] 为结尾的子序列的最长连续递增子序列
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int ans = 1;
        for (int i = 1;i < nums.length;i++){
            if (nums[i] > nums[i-1]){
                dp[i] = dp[i-1] + 1;
                ans = Math.max(ans,dp[i]);
            }
        }
        return ans;

        /*int ans = 1;
        for (int i = 1; i < nums.length; i++){
            for (int j = 0;j < i;j++){
                if (nums[i] > nums[j] && j + 1 == i){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;*/
    }
}
