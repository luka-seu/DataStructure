package com.plasticlove.sorts;

/**
 * 快速排序
 * @author Luka
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {23,45,2,34,234,22,56,34,67};
        quickSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arr,int start,int end){
        if (start>=end){
            return;
        }
        int firstPart = patition(arr,start,end);
        quickSort(arr,start,firstPart);
        quickSort(arr,firstPart+1,end);
    }

    //先是分区的过程
    public static int patition(int[] arr,int start,int end){
        //基准
        int pivot = arr[start];
        while(start<end){
            //大的数就跳过
            while(start<end&&arr[end]>=pivot){
                end--;
            }
            swap(arr,start,end);
            while(start<end&&arr[start]<=pivot){
                start++;
            }
            swap(arr,start,end);
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
