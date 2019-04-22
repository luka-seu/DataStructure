package com.plasticlove.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luka-seu
 * @description 输入n个整数，找出其中最小的K个数。
 * @create 2019/4/3-21:33
 */
public class ArraySmallestKNum {
    //冒泡排序
    public static ArrayList<Integer> findKSmallNum(int[] arr,int k){
        ArrayList<Integer> result = new ArrayList<>();
        if (k>arr.length){
            return result;
        }
        //冒泡排序
        for (int i = 0;i<k;i++){
            for (int j = arr.length-2;j>=i;j--){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            result.add(arr[i]);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {5,9,8,6,7,3,1,7,2};
        ArrayList<Integer> kSmallNum = findKSmallNum(arr, 4);
        for (int i:kSmallNum){
            System.out.println(i);
        }
    }
}
