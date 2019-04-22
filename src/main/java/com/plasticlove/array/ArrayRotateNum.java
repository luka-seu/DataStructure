package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 旋转数组的最小数字
 * @create 2019/4/3-17:56
 */
public class ArrayRotateNum {

    public static int minNumberInRotateArray(int [] array) {
        if(array.length<=0){
            return 0;
        }
        int i = array.length-1;
        //从后往前找
        while(i>0){
            if(array[i]<array[i-1]){
                break;

            }
            i--;

        }
        return array[i];

    }


}
