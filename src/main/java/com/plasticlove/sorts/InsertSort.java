package com.plasticlove.sorts;

/**
 * @author luka-seu
 * @description 插入排序
 * @create 2019-04 12-12:23
 **/

public class InsertSort {


    public static void insertSort(int[] arr){
        if (arr.length==0){
            return;
        }
        //每次取不在已排好序列的元素
        for (int i = 1;i<arr.length;i++){
            //在已排好序列中插入元素
            for (int j = 0;j<i;j++){
                if (arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
