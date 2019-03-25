package com.plasticlove.array;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayDataUtils {
    public static int MAX;//数组最大值
    public static int MIN;//数组最小值


    //找到数组中的最大值和最小值
    public static void findMaxAndMin(int array[]) {
        MAX = array[0];
        MIN = array[0];
        int i = 0;
        for (i = 0; i < array.length - 1; i = i + 2) {
            if (i + 1 > array.length) {
                if (array[i] > MAX) {
                    MAX = array[i];
                }
                if (array[i] < MIN) {
                    MIN = array[i];
                }
            }
            if (array[i] > array[i + 1]) {
                if (array[i] > MAX) {
                    MAX = array[i];
                }
                if (array[i + 1] < MIN) {
                    MIN = array[i + 1];
                }
            }

            if (array[i] < array[i + 1]) {
                if (array[i + 1] > MAX) {
                    MAX = array[i + 1];
                }
                if (array[i] < MIN) {
                    MIN = array[i];
                }
            }
        }
    }


    //找到数组中的第二大的值
    public static int findSecNum(int arr[]) {
        int max = arr[0];
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sec = max;
                max = arr[i];
            } else {
                if (arr[i] > sec) {
                    sec = arr[i];
                }
            }
        }
        return sec;
    }


    //冒泡排序

    public static int[] bubbleSort(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int len = arr.length;

        for (int i = 0; i < len; i++) {        //外层循环控制排序趟数
            for (int j = 0; j < len - 1 - i; j++) {//内层循环控制每趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //选择排序
    public static int[] selectSort(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //快速排序
    public static void quickSort(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int key = arr[start];   //选取第一个值作为基准
        int i = start;          //记录开启索引
        int j = end;            //记录结束索引
        int temp;
        while (i != j) {
            while (i < j && arr[j] >= key) {  //右边的大就递减
                j--;
            }
            while (i < j && arr[i] <= key) {  //左边的小就递增
                i++;
            }
            temp = arr[i];
            arr[i] = arr[j];          //不符合左小右大就交换左右位置的值
            arr[j] = temp;
        }
        arr[start] = arr[i];          //将基准值放在分割线上
        arr[i] = key;
        quickSort(arr, start, i - 1);
        quickSort(arr, j + 1, end);


    }
    //堆排序

    public static void heapSort(int[] arr){
        for (int i = arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);//重新对堆进行调整
        }

    }
    //堆排序
    private static void adjustHeap(int[] arr,int index,int length){
        int temp = arr[index];
        for(int i = 2*index+1;i<length;i= 2*i+1){
            if (i+1<length&&arr[i]<arr[i+1]){
                i++;
            }
            if (arr[i]>temp){
                arr[index] = arr[i];
                index = i;
            }else{
                break;
            }
        }
        arr[index] = temp;
    }

    //找出数组中的重复数字
    public static Integer getDuplicate(int[] arr) {
        int len = arr.length;
        if (len <= 0) {
            return null;
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] < 0 || arr[i] > len - 1) {
                return null;
            }
        }

        for (int i = 0; i < len; i++) {
            while (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) {
                    return arr[i];
                }
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;

            }
        }
        return null;
    }

    //不修改数组找出重复数字
    public static Integer getDuplicateWithoutModify(int arr[]) {
        int len = arr.length;
        if (len <= 0) {
            return null;
        }
        int start = 1;
        int end = len - 1;
        while (end >= start) {
            int middle = ((end - start) >> 1) + start;
            int count = countRange(arr, start, middle);
            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count > (middle - start + 1)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return null;


    }

    //统计在某个区间数组元素出现次数
    private static int countRange(int[] arr, int start, int end) {
        int len = arr.length;
        if (len <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] >= start && arr[i] <= end) {
                count++;
            }
        }
        return count;
    }

    //交换位置
    private static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

} 
