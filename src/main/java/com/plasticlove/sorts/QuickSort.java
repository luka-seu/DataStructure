package com.plasticlove.sorts;


import org.junit.Test;

/**
 * @author luka-seu
 * @description 快速排序
 * @create 2019-04 12-12:32
 **/

public class QuickSort {


    @Test
    public void test(){
        int[] arr = {40,45,3,67,43,98,12,86,34};
        quickSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.println(i);
        }
    }
    public void quickSort(int[] arr,int start,int end){
        if (start>=end){
            return;
        }
        int firstPart = patition(arr,start,end);
        quickSort(arr,start,firstPart);
        quickSort(arr,firstPart+1,end);

    }

    public int patition(int[] arr,int start,int end){
        int pivot = arr[start];
        while(start<end){
            while (start<end&&arr[end]>=pivot){
                end--;
            }
            swap(arr,start,end);
            while (start<end&&arr[start]<=pivot){
                start++;
            }
            swap(arr,start,end);


        }
        return start;
    }

    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
