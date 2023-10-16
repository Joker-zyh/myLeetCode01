package com.yaheng.tanxin;


import java.util.Arrays;

public class Solution12 {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        Arrays.fill(candy,1);
        for (int i = 1; i < ratings.length; i++){
            if (ratings[i] > ratings[i - 1]){
                candy[i] = candy[i - 1] + 1;
            }
        }
        
        for (int i = ratings.length -2; i >= 0;i--){
            if (ratings[i] > ratings[i + 1]){
                candy[i] = Math.max(candy[i],candy[i + 1] + 1);
            }
        }
        int result = 0;
        for (int i : candy) {
            result += i;
        }
        return result;
    }
}
