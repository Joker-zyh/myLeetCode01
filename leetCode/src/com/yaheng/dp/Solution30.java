package com.yaheng.dp;

public class Solution30 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int ans1 = getAns(nums,0,nums.length - 2);
        int ans2 = getAns(nums,1,nums.length - 1);
        return Math.max(ans1,ans2);
    }

    public int getAns(int[] nums,int start, int end){
        if (start == end) return nums[start];
        int[] dp = new int[nums.length];

        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start],nums[start+1]);

        for (int i = start + 2; i <= end;i++){
            dp[i] = Math.max(dp[i - 2] + nums[i],dp[i-1]);
        }
        return dp[end];

    }
}
