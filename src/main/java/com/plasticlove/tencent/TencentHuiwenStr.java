package com.plasticlove.tencent;

import org.junit.Test;

/**
 * @author luka-seu
 * @description 查找字符串的最长回文子序列（不连续）返回长度
 * @create 2019/4/5-17:46
 */
public class TencentHuiwenStr {
    //求最大长度的回文子序列问题
    public int solution1(String str){
        if (str==null||str.length()==0){
            return 0;
        }
        /**
         * dp[i][j]表示i到j的最大回文子序列长度 dp[i][i] = 1;
         * 若s[i]==s[j]则意味着dp[i][j] = dp[i+1][j-1]+2
         * 若s[i]!=s[j]则dp[i][j] = max(dp[i+1][j],dp[i][j-1])
         */

        int[][] dp = new int[str.length()][str.length()];
        for (int i = 0;i<str.length();i++){
            dp[i][i] = 1;
        }

        for(int k = 1;k<str.length();k++){
            for (int m = 0;m+k<str.length();m++){
                if (str.charAt(m)==str.charAt(k+m)){
                    dp[m][k+m]=dp[m+1][k+m-1]+2;
                }else{
                    dp[m][k+m] = Math.max(dp[m+1][k+m],dp[m][m+k-1]);
                }
            }
        }



        return dp[0][str.length()-1];
    }

    @Test
    public void test(){
        String test = "google";
        System.out.println(this.solution1(test));
    }
}
