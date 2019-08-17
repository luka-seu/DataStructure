package com.plasticlove.sorts;

import org.junit.Test;

/**
 * 堆排序
 *
 * @author Luka
 */
public class HeapSort {
    @Test
    public void test(){
        int[] arr = {32, 323, 45, 3, 7, 8, 55, 446, 90};
        this.heapSort(arr);
        for (int k : arr) {
            System.out.println(k);
        }
    }



    public void heapSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            //形成大根堆
            HeapInsert.heapInsert(arr, i);
        }
        //每次将最大的数和末尾的数交换
        swap(arr,0,arr.length-1);
        int heapSize = arr.length;
        while(heapSize>0){
            //除去末尾最大的数之后重新形成大根堆
            Heapify.heapify(arr,0,--heapSize);
            swap(arr,0,heapSize);
        }

    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
