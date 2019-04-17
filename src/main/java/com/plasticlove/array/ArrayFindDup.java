package com.plasticlove.array;

import java.util.Arrays;

/**
 * @author luka-seu
 * @description 长度1001的数组只有一个数字出现大于1次，所有的数字都在1~1000，如何找到这个重复的数字，尽量的节省空间
 * @create 2019/4/17-15:13
 */
public class ArrayFindDup {

    public static int findDup(int[] arr){
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]!=i){
                result = arr[i];
            }
        }
        return result;

    }
}
