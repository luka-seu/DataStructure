package com.plasticlove.base;

/**
 * @author luka-seu
 * @description 归并排序
 * @create 2019-09 10-21:27
 **/

public class MergeSort {

    public void mergeSort(int[] arr,int left,int right){
        //递归结束条件
        if (left==right){
            return;
        }
        int mid = left+(right-left)/2;
        //先拍好左边的
        mergeSort(arr,left,mid);
        //在拍好右边的
        mergeSort(arr,mid+1,right);
        //外排
        merge(arr,left,right,mid);
    }

    private void merge(int[] arr, int left, int right, int mid) {
        int[] help = new int[arr.length];
        int l = left;
        int r = mid+1;
        int k = 0;
        while(l<=mid&&r<=right){
            help[k++] = arr[l]>=arr[r]?arr[r++]:arr[l++];
        }
        while(l<=mid){
            help[k++] = arr[l++];
        }
        while(r<=right){
            help[k++] = arr[r++];
        }
        for (int i = 0;i<help.length;i++){
            arr[i] = help[i];
        }
    }


}
