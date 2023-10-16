package com.yaheng.dp;

public class Solution29 {
    public int rob(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        // dp[i] 表示 偷取前 i 个 房间 所得到的最大金额
        int[] dp = new int[nums.length];
        // 递推公式 dp[i] = Math.max(dp[i-2] + nums[i],dp[i-1])
        // 初始化
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for (int i = 2;i < nums.length;i++){
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i-1]);
        }
        return dp[nums.length- 1];
    }
}
