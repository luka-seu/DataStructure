package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 二进制中1的个数
 * @create 2019/4/3-18:03
 */
public class ArrayNumOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
}
