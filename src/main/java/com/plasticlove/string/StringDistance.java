package com.plasticlove.string;

/**
 * @author luka-seu
 * @description
 *
 *
 * 题目描述
 * 对于不同的字符串，我们希望能有办法判断相似程度，我们定义了一套操作方法来把两个不相同的字符串变得相同，具体的操作方法如下：
 * 1 修改一个字符，如把“a”替换为“b”。
 * 2 增加一个字符，如把“abdd”变为“aebdd”。
 * 3 删除一个字符，如把“travelling”变为“traveling”。
 * 比如，对于“abcdefg”和“abcdef”两个字符串来说，我们认为可以通过增加和减少一个“g”的方式来达到目的。上面的两种方案，都只需要一次操作。把这个操作所需要的次数定义为两个字符串的距离，而相似度等于“距离＋1”的倒数。也就是说，“abcdefg”和“abcdef”的距离为1，相似度为1/2=0.5.
 * 给定任意两个字符串，你是否能写出一个算法来计算出它们的相似度呢？
 *  
 * 约束：
 * 1、PucAExpression/ PucBExpression字符串中的有效字符包括26个小写字母。
 * 2、PucAExpression/ PucBExpression算术表达式的有效性由调用者保证;
 * 3、超过result范围导致信息无法正确表达的，返回null。
 *  
 * 输入描述:
 * 输入两个字符串
 * 输出描述:
 * 输出相似度，string类型
 * @create 2019/4/10-16:13
 */
public class StringDistance {



    public static String getDistance(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] dp = new int[len1+1][len2+1];
        dp[0][0] = 0;
        for (int i = 1;i<len1+1;i++){
            dp[i][0] = i;
        }
        for (int j = 1;j<len2+1;j++){
            dp[0][j] = j;
        }

        for (int m = 1;m<=len1;m++){
            for (int n = 1;n<=len2;n++){
                if (s1.charAt(m)==s2.charAt(n)){
                    dp[m][n] = dp[m-1][n-1];
                }else{
                    /**
                     * dp[m-1][n]表示删除s1(m)
                     * dp[m][n-1]表示s2增加一个元素
                     * dp[m-1][n-1]表示替换
                     */
                    dp[m][n] = Math.min(dp[m-1][n],Math.min(dp[m][n-1],dp[m-1][n-1]))+1;
                }
            }
        }
        return dp[len1][len2]+"";
    }
}
