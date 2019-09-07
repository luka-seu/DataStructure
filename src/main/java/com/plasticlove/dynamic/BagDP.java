package com.plasticlove.dynamic;

import org.junit.Test;

/**
 * @author luka-seu
 * @description 01背包问题 每件商品只有一件
 * @create 2019-09 07-17:15
 **/

public class BagDP {

    @Test
    public void test() {
        int[] caps = {2, 1};
        int[] values = {3, 4};
        int totalCap = 5;
        System.out.println(this.knapsackProblem(totalCap,caps, values ));
    }

    public  int knapsackProblem(int v, int[] c, int[] w){
        int n = c.length;
        int[][] dp = new int[n+1][v+1];
        // 背包容量为0时，价值为0
        for(int i = 0; i <= n; i++)
            dp[i][0] = 0;
        // 背包里不放任何物品时，其价值也为0
        for(int j = 0; j <= v; j++)
            dp[0][j] = 0;
        // 计算剩余每个dp[i][j]
        for(int i = 1; i <= n; i++){
            for(int j = c[i-1]; j <= v; j++){ // c[i-1]是因为c是从0开始的，i-1表示的为第i个，w[i-1]同理
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-c[i-1]]+w[i-1]);
            }
        }
        return dp[n][v];
    }






}
