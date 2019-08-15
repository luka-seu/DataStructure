package com.plasticlove.sorts;

import org.junit.Test;

/**
 * 插入排序
 * @author Luka
 */
public class InsertSort {

    @Test
    public void test(){
        int[] arr = {23,34,2,54,678,23,12,35};
        this.insertSort(arr);
        for (int m: arr){
            System.out.println(m);
        }
    }

    public void insertSort(int[] arr){
        //将未排序的插入到已排序的序列中
        if (arr==null||arr.length<2){
            return;
        }
        //已排好序列的最后一位索引+1(带插入的数字)
        for (int i= 1;i<arr.length;i++){
            //从已排好序列中考试比较
            for (int j =0;j<i;j++){
                if (arr[j]>arr[i]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
