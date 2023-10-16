package com.yaheng.dp;

public class Solution43 {
    public int findLength(int[] nums1, int[] nums2) {
        // dp[i][j] 表示 以i-1结尾的A，和以j-1结尾的B，最长重复子数组长度
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        dp[0][0] = 0;
        int ans = 0;
        for (int i = 1; i <= nums1.length;i++){
            for (int j = 1; j <= nums2.length;j++){
                if (nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                ans = Math.max(ans,dp[i][j]);
            }
        }
        return ans;
    }
}
