package com.plasticlove.array;

import java.util.ArrayList;

/**
 * @author luka-seu
 * @description 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @create 2019/4/3-18:04
 */
public class ArrayReorderArray {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                list2.add(array[i]);
            }else{
                list1.add(array[i]);
            }
        }
        list1.addAll(list2);
        for(int i = 0;i<list1.size();i++){
            array[i] = list1.get(i);
        }
    }
}
