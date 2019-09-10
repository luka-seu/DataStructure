package com.plasticlove.base;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

/**
 * @author luka-seu
 * @description 最长回文子串
 * @create 2019-09 10-22:07
 **/

public class MaxLengthPaliSubString {

    @Test
    public void test(){
        String s = "abbaab";
        System.out.println(this.func(s));
    }


    public int func(String s){
        //动态规划
        int len = s.length();
        char[] chars = s.toCharArray();
        //dp[i][j]表示第i个字符到第j个字符之间是否是回文字符串
        int[][] dp = new int[len][len];
        //对角线上的都为1,相邻两个字符
        for (int m = 0;m<len;m++){
           dp[m][m] = 1;
           if (m+1<len){
               dp[m][m+1] = (s.charAt(m)==s.charAt(m+1)?1:0);
           }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<len;i++){
            //j不会比i小
            for (int j =i+2;j<len;j++){
                if (s.charAt(i)==s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1];
                    if (dp[i][j]==1){
                        max = Math.max(j-i+1,max);
                    }
                }else{
                    dp[i][j] = 0;
                }


            }
        }
        return max;

    }



}
