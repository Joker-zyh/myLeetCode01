package com.yaheng.tanxin;

public class Solution08 {
    public int jump(int[] nums) {
        int curDistance = 0;
        int ans = 0;
        int nextDistance = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nextDistance = Math.max(i + nums[i],nextDistance);
            if (i == curDistance){
                ans++;
                curDistance = nextDistance;
            }
        }
        return ans;
    }
}
