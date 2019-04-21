package com.plasticlove.array;

import org.junit.Test;

/**
 * @author luka-seu
 * @description 连续子数组的最大和
 * @create 2019/4/3-18:17
 */
public class ArrayGreatestSumofSubArray {
    public int findGreatestSumOfSubArray(int[] array) {
        int result = array[0];
        int total = array[0];
        for(int i =1;i<array.length;i++){
            //如果当前的和小于零直接舍弃
            if(total<0){
                total = array[i];
            }else{
                total = total+array[i];
            }
            if(total>result){
                result = total;
            }
        }
        return result;
    }

    @Test
    public void test(){
        int[] arr = {-4,-14,-3,12,-3,3,2,4,-5};
        System.out.println(this.findGreatestSumOfSubArray(arr));
    }
}
