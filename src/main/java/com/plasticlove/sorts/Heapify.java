package com.plasticlove.sorts;

/**
 * 堆排序：当一个节点的值变小了之后，需要调整重新形成大根堆
 *
 * @author Luka
 */
public class Heapify {
    /**
     * @param arr
     * @param index    变小的数的位置
     * @param heapSize 当前堆的大小
     */
    public static void heapify(int[] arr, int index, int heapSize) {
        //index的左孩子
        int left = 2 * index + 1;
        //不越界
        while (left < heapSize) {
            //左孩子和右孩子大的那个
            int largestIndex = left + 1 < heapSize && arr[left] < arr[left + 1] ? left + 1 : left;
            //孩子和index的大的那个
            largestIndex = arr[largestIndex] > arr[index] ? largestIndex : index;
            //index依然大于孩子
            if (largestIndex == index) {
                break;
            }
            swap(arr, index, largestIndex);
            //一直向下
            index = largestIndex;
            left = 2 * index + 1;

        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
