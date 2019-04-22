package com.plasticlove.string;

import org.junit.Test;

/**
 * @author luka-seu
 * @description 最长公共连续子串
 * @create 2019/4/22-16:53
 */
public class TwoStringsLongestSubString {



    public int getResult(String s1,String s2){
        //dp[m][n]表示s1以m号字符和s2以n号字符结尾的最长公共子串
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        int max = -1;
        for (int m = 1;m<=s1.length();m++){
            for (int n = 1;n<=s2.length();n++){
                if (s1.charAt(m-1)==s2.charAt(n-1)){
                    dp[m][n] = dp[m-1][n-1]+1;
                }else{
                    dp[m][n] = 0;
                }
                if (max<dp[m][n]){
                    max = dp[m][n];
                }
            }
        }

        return max;
    }

    @Test
    public void test(){
        String s1 = "12345678";
        String s2 = "12367854";
        System.out.println(this.getResult(s1,s2));
    }
}
