package com.plasticlove.array;

import java.util.Arrays;

/**
 * @author luka-seu
 * @description 二分查找
 * @create 2019/4/17-16:24
 */
public class BianrySearch {

    public static void main(String[] args) {
        int[] arr = {134,343,56,7,23,84,35,24};

        System.out.println(bianrySeach(arr,343));
    }

    public static int bianrySeach(int[] arr,int num){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;

        int result = -1;
        //这个地方必须要有等号
        while (low<=high){
            int mid = (low+high)>>1;
            if (num<arr[mid]){
                //这个地方应该是减一或者加一
                high = mid-1;
            }else if (num>arr[mid]){
                low = mid+1;
            }else{
               result = mid;
               break;
            }
        }
        return result;
    }
}
