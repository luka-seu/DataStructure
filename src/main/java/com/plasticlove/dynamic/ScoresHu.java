package com.plasticlove.dynamic;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description 动态规划得分
 * @create 2019/4/15-20:25
 */
public class ScoresHu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int[] times = new int[n];
        for (int i =0;i<n;i++){
            scores[i] = sc.nextInt();
        }
        for (int j =0;j<n;j++){
            scores[j] = sc.nextInt();
        }
        int totalTime = sc.nextInt();
        System.out.println(getMaxScore(scores,times,totalTime));

    }

    public static int getMaxScore(int[] scores,int[] times,int totalTime) {
        int len_score = scores.length;
        // int len_times = times.length;
        //dp[s][t]表示在t时间内到i个题最多得到的分
        int[][] dp = new int[len_score + 1][totalTime + 1];
        // for(int i = 0;i<=len_score;i++){
        //     dp[i][0] = 0;
        // }
        // for(int j = 0;j<=len_times;j++){
        //     dp[0][j] = 0;
        // }
        for (int i = 1;i<=len_score;i++){
            for (int j = 1;j<=totalTime;j++){
                //下标都是从零开始
                if (times[i-1]>j){
                    //如果第i道题比当前总时间大，直接不加入
                    dp[i][j] = dp[i-1][j];
                }else{
                    //加入，比较不加入和加入的总得分，不加入的得分需要减去当前的时间
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-times[i-1]]+scores[i-1]);
                }
            }
        }
        return dp[len_score][totalTime];
    }
}
