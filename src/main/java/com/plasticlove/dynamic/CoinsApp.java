package com.plasticlove.dynamic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description 题目描述：
 *
 * 安装应用奖励金币活动，不同的应用下载，试玩需要的流量大小不同，奖励的金币数量也不同，同一个应用多次下载只奖励一次金币，小华月末有一定的余量，计算下载哪些应用可以获取的金币最多？相同金币情况下，优先下载排名靠前的应用。
 *
 * 输入描述：
 *
 * 输入分三行
 *
 * 第一行：流量数，单位MB，整数
 *
 * 第二行：应用排名顺序，下载、试玩需要流量数，单位MB，整数
 *
 * 第三行：应用奖励的金币数
 *
 * 输出描述：
 *
 * 输出应用列表：建议下载的应用顺序号，用一个空格分隔
 *
 * @create 2019/4/9-13:52
 */
public class CoinsApp {

    // public static ArrayList<Integer> getMaxCoins(int[] coins,int[] apps,int total){
    //     int len_coins = coins.length;
    //     int len_apps = coins.length;
    //     //dp[i][j]表示i个应用需要j流量的最大金币
    //     int[][] dp = new int[len_apps+1][total+1];
    //     ArrayList<Integer> list = new ArrayList<>();
    //
    //     for (int i = 1;i<=len_apps;i++){
    //         //对每一个流量总量遍历
    //         for (int j = 1;j<=total;j++){
    //             if (apps[i]<=j) {
    //                 if (dp[i - 1][j]>dp[i - 1][j - apps[i]] + coins[i]) {
    //                     dp[i][j] = dp[i - 1][j];
    //
    //                 }else{
    //                     dp[i][j] = dp[i - 1][j - apps[i]] + coins[i];
    //                     list.add(i);
    //                 }
    //             }else{
    //                 dp[i][j] = dp[i-1][j];
    //             }
    //         }
    //     }
    //     return list;
    // }


    public static String getMaxCoins(int[] apps, int[] coins, int total) {
        int len_apps = apps.length;
        int len_coins = coins.length;
        //dp[i][j]表示i个应用需要j流量的最大金币
        int[][] dp = new int[len_apps + 1][total + 1];
        for (int i = 1; i <= len_apps; i++) {
            for (int j = 1; j <= total; j++) {
                //流量和金币数的数组下标都是从零开始的
                if (apps[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - apps[i - 1]] + coins[i - 1]);
                }
            }
        }
        //最后最大收益为最后一个元素

        int k = total;
        String result = "";
        for (int i = len_apps; i > 0; i--) {
            if (dp[i][k] > dp[i - 1][k]) {
                result = i + " " + result;
                k = k - apps[i - 1];
            }
            if (k == 0) {
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //可以处理数字和字符串混合输入还有一种方法就是
            //int v=sc.nextInt();
            //sc.nextLine();
            //String s1 = sc.nextLine();
            //String s2 = sc.nextLine();
            int total = Integer.valueOf(sc.nextLine());
            String apps = sc.nextLine();
            String coins = sc.nextLine();
            String[] appsArrs = apps.split(" ");
            String[] coinsArrs = coins.split(" ");
            int[] coinsArr = new int[appsArrs.length];
            int[] appsArr = new int[appsArrs.length];
            for (int i = 0; i < appsArrs.length; i++) {
                coinsArr[i] = Integer.valueOf(coinsArrs[i]);
                appsArr[i] = Integer.valueOf(appsArrs[i]);

            }
            // int[] appsArr = {12,13,23,36};
            // int[] coinsArr = {11,11,20,30};
            // int total = 40;


            System.out.println(getMaxCoins(appsArr, coinsArr, total));

        }
    }
}


