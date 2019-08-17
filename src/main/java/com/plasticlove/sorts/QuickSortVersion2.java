package com.plasticlove.sorts;

import org.junit.Test;

/**
 * 随机快排
 * @author Luka
 */
public class QuickSortVersion2 {

    @Test
    public void test(){
        int[] arr = {23,34,5,2,3,45,6,3,45,3};
        quickSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.println(i);
        }
    }

    public void quickSort(int[] arr,int left,int right){
        if(left<right){
            //随机选取pivot
            swap(arr,left+(int)(Math.random()*(right-left+1)),right);
            int[] help = this.patition(arr,left,right);
            quickSort(arr,left,help[0]-1);
            quickSort(arr,help[1]+1,right);
        }


    }



    public int[] patition(int[] arr, int start, int end){
        int l = start-1;
        int r = end;
        while(start<r){
            if (arr[start]<arr[end]){
                swap(arr,++l,start++);
            }else if (arr[start]>arr[end]){
                swap(arr,--r,start);
            }else{
                start++;
            }
        }
        swap(arr,r,end);
        return new int[] {l+1,r};
    }
    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
