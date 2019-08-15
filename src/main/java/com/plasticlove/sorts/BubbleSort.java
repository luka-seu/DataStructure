package com.plasticlove.sorts;

import org.junit.Test;

/**
 * 冒泡排序
 * @author Luka
 */
public class BubbleSort {
    @Test
    public void test(){
        int[] arr = {23,34,2,54,678,23,12,35};
        this.bubbleSort(arr);
        for (int m: arr){
            System.out.println(m);
        }
    }

    public void bubbleSort(int[] arr){
        //每次将最大的数放在后面
        if (arr==null||arr.length<2){
            return;
        }
        //i表示需要冒泡的次数
        for (int i = 0;i<arr.length;i++){
            //从零开始，相邻比较
            for (int j = 0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
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
