package com.yaheng.dp;

public class packComplete {
    public static void packCompleteTwo(){
        int[] weight = new int[]{1,3,4};
        int[] value = new int[]{15,20,30};
        int bagWeight = 4;

        int[] dp = new int[bagWeight+1];
        for (int i = 0; i < weight.length;i++){
            for (int j = weight[i]; j <= bagWeight;j++){
                dp[j] = Math.max(dp[j],dp[j - weight[i]] +value[i]);
            }
        }

        for (int num :
                dp) {
            System.out.print(num + " ");
        }
    }



    public static void main(String[] args) {
        int[] weight = new int[]{1,3,4};
        int[] value = new int[]{15,20,30};
        int bagWeight = 4;

        int[][] dp = new int[weight.length][bagWeight + 1];
        for (int i = weight[0]; i <= bagWeight;i++){
            dp[0][i] = dp[0][i - weight[0]] + value[0];
        }

        for (int i = 1; i < weight.length;i++){
            for (int j = 0; j <= bagWeight;j++){
                if (j < weight[i]){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i]] + value[i]);
                }
            }
        }

        for (int[] arr :dp) {
            for (int num :arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        packCompleteTwo();
    }
}
