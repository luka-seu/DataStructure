package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 找出数组第二大的值
 * @create 2019/4/3-18:28
 */
public class ArrayFindSecondNum {
    public int findSecNum(int arr[]) {
        int max = arr[0];
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sec = max;
                max = arr[i];
            } else {
                if (arr[i] > sec) {
                    sec = arr[i];
                }
            }
        }
        return sec;
    }
}
