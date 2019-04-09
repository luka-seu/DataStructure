package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 等差数列前n项和
 * @create 2019/4/9-15:06
 */
public class SumOfEqualArray {
    public static int sum(int diff,int n,int begin){
        int result = 0;
        for (int i= 0;i<n;i++){
            result = result+i*diff+begin;
        }
        return result;
    }
}
