package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 两个有序数组中找第k大
 * @create 2019/4/17-15:19
 */
public class TwoArraysFindKthNum {

    public static int findKthNum(int[] arr1,int[] arr2,int k){
        int left = 0;int right = 0;
        int count = 0;
        while (count<k){
            if (arr1[left]<=arr2[right]){
                left++;
            }else {
                right++;
            }
            count++;
    }
        return arr1[left]>arr2[right]?arr2[right]:arr1[left];
    }
}
