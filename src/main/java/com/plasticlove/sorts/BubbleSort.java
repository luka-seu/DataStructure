package com.plasticlove.sorts;

/**
 * @author luka-seu
 * @description 冒泡排序
 * @create 2019-04 12-11:59
 **/

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,45,3,67,43,98,12,86,34};
        bubble(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }

    public static void bubble(int[] arr){
        if (arr.length==0){
            return;
        }
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
