package com.plasticlove.base;

/**
 * @author luka-seu
 * @description 二分查找
 * @create 2019-09 10-21:35
 **/

public class BinarySerach {

    public int binarySearch(int[] arr,int target){
        int l = 0;
        int r = arr.length-1;
        int mid = l+(r-l)/2;
        while(mid!=0){
            if (arr[mid]>target){
                r = mid;
            }else if (arr[mid]<target){
                l = mid+1;
            }else {
                return mid;
            }
            mid = l+(r-l)/2;
        }
        return -1;
    }
}
