package com.plasticlove.array;

import java.util.ArrayList;

/**
 * @author luka-seu
 * @description 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @create 2019/4/3-18:21
 */
public class ArrayFindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int i = 0;
        int j = array.length-1;
        ArrayList list = new ArrayList();
        while(i<j){
            if(array[i]+array[j]==sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }else if(array[i]+array[j]>sum){
                j--;
            }else{
                i++;
            }
        }
        return list;
    }
}
