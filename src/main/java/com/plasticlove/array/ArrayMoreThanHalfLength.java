package com.plasticlove.array;

import java.util.Arrays;

/**
 * @author luka-seu
 * @description 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * @create 2019/4/3-18:16
 */
public class ArrayMoreThanHalfLength {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int count = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]==array[array.length/2]){
                count++;
            }
        }
        if(count>array.length/2){
            return array[array.length/2];

        }else{
            return 0;
        }
    }
}
