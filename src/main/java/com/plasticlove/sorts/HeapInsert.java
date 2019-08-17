package com.plasticlove.sorts;

import org.junit.Test;

/**
 * 堆排序:插入新节点
 * 大根堆
 *
 * @author Luka
 */
public class HeapInsert {

    @Test
    public void test() {
        int[] arr = {32, 323, 45, 3, 7, 8, 55, 446, 90};
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }


    public static void heapInsert(int[] arr, int index) {
        //一致向上跳，跳到了0位置，这时arr[(-1)/2] = arr[0],跳出循环
        while (arr[(index - 1) / 2] < arr[index]) {
            swap(arr, (index - 1) / 2, index);
            index = (index - 1) / 2;
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
