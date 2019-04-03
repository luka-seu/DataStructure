package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 连续子数组的最大和
 * @create 2019/4/3-18:17
 */
public class ArrayGreatestSumofSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int result = array[0];
        int total = array[0];
        for(int i =1;i<array.length;i++){
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
}
