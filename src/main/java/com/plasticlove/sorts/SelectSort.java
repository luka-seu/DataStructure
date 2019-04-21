package com.plasticlove.sorts;

/**
 * @author luka-seu
 * @description 选择排序
 * @create 2019-04 12-12:10
 **/

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {2,45,3,67,43,98,12,86,34};
        selectSort(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }


    public static void selectSort(int[] arr){
        if(arr.length==0){
            return;
        }
        for(int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
