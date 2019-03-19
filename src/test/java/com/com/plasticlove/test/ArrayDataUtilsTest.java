package com.com.plasticlove.test;

import com.plasticlove.array.ArrayDataUtils;
import org.junit.Test;



public class ArrayDataUtilsTest {
    int array[] = {15,42,56,41,13,78,65,789,324,15,32,45,74};
    @Test
    public void findMaxAndMin() {

        ArrayDataUtils.findMaxAndMin(array);
        System.out.println(ArrayDataUtils.MAX);
        System.out.println(ArrayDataUtils.MIN);
    }

    @Test
    public void findSecNum() {
        int result = ArrayDataUtils.findSecNum(array);
        System.out.println(result);
    }

    @Test
    public void bubbleSortTest(){
        ArrayDataUtils.bubbleSort(array);
        for (int i:array){
            System.out.println(i);
        }
    }

    @Test
    public void selectSortTest(){
        int[] sort = ArrayDataUtils.selectSort(array);
        for (int i:sort){
            System.out.println(i);
        }
    }

    @Test
    public void quickSort() {
        ArrayDataUtils.quickSort(array,0,array.length-1);
        for (int i :array){
            System.out.println(i);
        }
    }
}