package com.plasticlove.tencent;

/**
 * @author luka-seu
 * @description 组装歌单
 * @create 2019/4/5-13:58
 */
public class TencentSongs {
    public static int combine(int numA,int A,int numB,int B,int target){
        //dp[i][j]表示前j个元素组成长度为i的组合数
        int[][] dp = new int[target+1][numA+numB];
        for(int i = 1;i<numA+numB;i++){
            //前j个元素组成长度为0的组合数为0，也就是都不放入
            dp[0][i] = 0;
        }
        //将所有的长度放入一个数组
        int[] len = new int[numA+numB];
        for (int m = 0;m<numA;m++){
            len[m] = A;
        }
        for (int n = numA;n<numA+numB;n++){
            len[n] = B;
        }
        //对每一个长度进行遍历
        for (int k = 1;k<target+1;k++){
            for (int l = 0;l<numA+numB;l++){
                //如果是一个元素先判断其能不能组成长度k
                if (l==0){
                    if (len[l]==k){
                        dp[k][0] = 1;
                    }
                }else {
                    /**
                     * 对于前l个元素组成长度k，等于前l-1组成长度为k的组合数+length[l]。对length[l]加以判断
                     * 若length[l]>k则不可能将第k个元素加入，则判断dp[k-len[l]][l-1]也就是前l-1个元素组成
                     * 长度为k-len[l]的组合数也就是将l个元素添加之后的新增的组合数
                     */
                    dp[k][l] = dp[k][l-1]+(len[l]<=k?dp[k-len[l]][l-1]:0);
                }
            }
        }
        return dp[target][numA+numB-1];

    }


}
