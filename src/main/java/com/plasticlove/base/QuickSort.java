package com.plasticlove.base;

/**
 * @author luka-seu
 * @description 快排
 * @create 2019-09 10-20:57
 **/

public class QuickSort {


    public void quickSort(int[] arr,int left,int right){
        //每次随机放一个数在最后，用作基准
        swap(arr,(int)(Math.random()*(right-left+1)),right);
        //返回的是等于基准区间的前后索引值
        int[] help = partition(arr,left,right);
        quickSort(arr,left,help[0]-1);
        quickSort(arr,help[1]+1,right);
    }


    /**
     * patition的过程
     * @param arr
     * @param left
     * @param right
     * @return 等于基准数的前后索引值
     */
    public int[] partition(int[] arr,int left,int right){
        int l = left-1;
        int r = right;
        while(left<r){
            //0-l表示小于区域
            //如果当前的数小于基准数。就让当前数和小于区域下一个数（l+1）交换。同时当前数向下加一
            if(arr[left]<arr[right]){
                swap(arr,++l,left++);
            } else if (arr[left]>arr[right]){
                swap(arr,left,--r);
            }else{
                left++;
            }

        }
        //将基准放在中间
        swap(arr,r,right);
        return new int[]{l+1,r};
    }
    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
