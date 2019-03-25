package com.com.plasticlove.test;

import com.plasticlove.array.ArrayDataUtils;
import org.junit.Test;



public class ArrayDataUtilsTest {
    int array[] = {15,42,56,41,13,78,65,789};
    int array2[] = {2,3,1,0,2,5,3};
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

    @Test
    public void testGetDuplicate(){
        Integer duplicate = ArrayDataUtils.getDuplicateWithoutModify(array2);
        System.out.println(duplicate.toString());
    }

    @Test
    public void testHeapSort(){
        ArrayDataUtils.heapSort(array);
        for (int i :array){
            System.out.println(i);
        }
    }
}