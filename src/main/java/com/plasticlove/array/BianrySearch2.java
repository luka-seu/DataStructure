package com.plasticlove.array;

import org.junit.Test;

/**
 * @author luka-seu
 * @description 分割有序数组后查值-二分查找的变形
 * @create 2019/4/17-17:06
 */
public class BianrySearch2 {

    public int bianrySearch2(int[] arr,int target,int start,int end){
        if (start>end){
            return -1;
        }
        int mid = start+(end-start)>>1;
        if (arr[mid]==target){
            return mid;
        }
        //在后半部分查找
        if (arr[mid]<arr[end-1]){
            //在递增序列中
            if (target>arr[mid]&&target<arr[end-1]){
               return bianrySearch2(arr,target,mid+1,end);
            }else{
                for (int i = 0;i<mid;i++){
                    if (arr[i]==target){
                        return i;

                    }
                }
            }
            //总有一部分是递增的
        }else if (arr[0]<arr[mid]){
            if (target>arr[0]&&target<arr[mid]){
                return bianrySearch2(arr,target,0,mid);
            }else{
                for (int j = mid+1;j<end;j++){
                    if (arr[j]==target){
                        return j;
                    }
                }
            }
        }
        return -1;

    }

    @Test
    public void test(){
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(this.bianrySearch2(arr,9,0,arr.length));
    }


}
