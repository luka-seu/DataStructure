package com.plasticlove.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 *
 * 编写一个函数，传入一个int型数组，返回该数组能否分成两组，
 * 使得两组中各元素加起来的和相等，并且，所有5的倍数必须在其中一个组中，
 * 所有3的倍数在另一个组中（不包括5的倍数），能满足以上条件，返回true；不满足时返回false。
 * @create 2019/4/9-16:37
 */
public class ArrayCutToTwo {

    public static boolean cutArray(int[] array){
        Arrays.sort(array);
        List<Integer> five = new ArrayList<>();
        List<Integer> three = new ArrayList<>();
        List<Integer> non = new ArrayList<>();
        for (int i:array){
            if (i%5==0){
                five.add(i);
            }else if (i%3==0){
                three.add(i);
            }else{
                non.add(i);
            }
        }
       if (non.size()==0){
           if (getSum(five)==getSum(three)){
               return true;
           }else {
               return false;
           }
       }else{
           int sumNon = getSum(non);
           int temp = getSum(three)+sumNon-getSum(five);
           if (temp%2!=0){
               return false;
           }
           int partSum = (getSum(three)+sumNon-getSum(five))/2;

           boolean flag = false;
           for (int i = 0;i<non.size();i++){
               if (non.contains(partSum-non.get(i))){
                   flag = true;
                   break;
               }
           }
           return flag;
       }


    }
    public static int getSum(List<Integer> list){
        int sum = 0;
        for (int i:list){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        int[] arr = {1,2,3,4};
        System.out.println(cutArray(arr));
    }
}
