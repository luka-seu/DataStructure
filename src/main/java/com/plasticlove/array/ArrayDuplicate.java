package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 数组中的重复数字
 * @create 2019/4/3-18:22
 */
public class ArrayDuplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for(int i = 0;i<length;i++){
            while(numbers[i]!=i){
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i]=numbers[temp];
                numbers[temp]=temp;
            }

        }
        return false;
    }
}
