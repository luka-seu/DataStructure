package com.plasticlove.array;

import org.junit.Test;

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

    public boolean duplicate2(int numbers[],int length,int [] duplication) {
        //boolean数组初始值为false
        //下标为原数组的元素
        boolean[] arr = new boolean[length];
        for(int i = 0;i<length;i++){
            if (arr[numbers[i]]==true){
                duplication[0] = numbers[i];
                return true;
            }
            arr[numbers[i]]=true;


        }
        return false;
    }

    @Test
    public void test(){
        int[] arr = {2,4,9,6,5,3,2,7,1,4};
        int[] result = new int[1];
        duplicate2(arr,arr.length,result);
    }

}
