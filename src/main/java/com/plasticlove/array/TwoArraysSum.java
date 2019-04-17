package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 给定两个有序数组和一个指定的sum值，从两个数组中各找一个数使得这两个数的和与指定的sum值相等
 * @create 2019/4/17-15:03
 */
public class TwoArraysSum {

    public static void findTwoSums(int[] arr1,int[] arr2,int sum){
        int left = 0;
        int right = arr2.length-1;
        int resultLeft = 0;
        int resultRight = 0;
        while (left<arr1.length&&right>=0){
            if (arr1[left]+arr2[right]==sum){
                resultLeft = arr1[left];
                resultRight = arr2[right];
                left++;
                right--;
            }else if (arr1[left]+arr2[right]>sum){
                right--;
            }else {
                left++;
            }
        }
        System.out.println(resultLeft+"----"+resultRight);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {2,23,34,41,52,63,72};
        findTwoSums(arr1,arr2,3);
    }
}
