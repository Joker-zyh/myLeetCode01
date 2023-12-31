package com.yaheng.tanxin;

public class Solution06 {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            result += Math.max(prices[i] - prices[i - 1],0);
        }
        return result;
    }
}
