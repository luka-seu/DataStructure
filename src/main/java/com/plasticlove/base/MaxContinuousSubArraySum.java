package com.plasticlove.base;

/**
 * @author luka-seu
 * @description 最大连续子序列和
 * @create 2019-09 10-21:56
 **/

public class MaxContinuousSubArraySum {

    public int func(int[] arr){
        int res = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (res<0){
                res = arr[i];
            }else{
                res = res+arr[i];
            }
            max = Math.max(res, max);
        }
        return max;


    }

}
