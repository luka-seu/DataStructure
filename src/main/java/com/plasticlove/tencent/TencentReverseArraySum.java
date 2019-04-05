package com.plasticlove.tencent;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description 翻转数列
 * @create 2019/4/4-18:23
 */
public class TencentReverseArraySum {
    public static int getSumOfReverseArray(int n,int m){
        if (n>Math.pow(10,9)||n<2||m<1||n%(2*m)!=0){
            return -1;
        }
        int part = n/m;
        int[] sumArr = new int[part];
        for (int i = 0;i<part;i++){
            int index = 0;
            while(index<m){
                sumArr[i] = (int) (sumArr[i]+Math.pow(-1,i+1)*(i*m+index+1));
                index++;
            }
        }
        int result = 0;
        for (int i:sumArr){
            result = result+i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long result = (long)m*n/2;//为什么没想到呢
        System.out.println(result);

    }


}
