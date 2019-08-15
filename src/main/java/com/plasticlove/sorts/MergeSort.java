package com.plasticlove.sorts;

import org.junit.Test;

/**
 * 归并排序
 * @author Luka
 */
public class MergeSort {
    @Test
    public void test(){
        int[] arr = {23,34,2,54,678,23,12,35};
        this.mergeSort(arr,0,arr.length-1);
        for (int m: arr){
            System.out.println(m);
        }
    }

    public void mergeSort(int[] arr,int left,int right){
        //分开排序，之后合并，递归
        //递归结束条件：左指针和右指针相等
        if (left==right){
            return;
        }
        //等同于（left+right）/ 2
        int mid = left+((right-left)>>1);
        //左边排序
        mergeSort(arr,left,mid);
        //右边排序
        mergeSort(arr,mid+1,right);
        //归并
        merge(arr,left,mid,right);


    }

    private void merge(int[] arr, int left, int mid, int right) {
        //导致归并的空间复杂度为o(N)
        int[] help = new int[right-left+1];
        int l = left;
        int r = mid+1;
        int i = 0;
        //左侧和右侧merge过程
        while(l<=mid&&r<=right){
            help[i++] = arr[l]>arr[r]?arr[r++]:arr[l++];
        }
        //右侧merge完，左侧还没
        while(l<=mid){
            help[i++] = arr[l++];
        }
        while(r<=right){
            help[i++] = arr[r++];
        }
        //拷贝回原数组
        for (int k = 0;k<help.length;k++){
            //起点师从left开始的
            arr[left+k] = help[k];
        }
    }
}
