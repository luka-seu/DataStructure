package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 1到N的1的出现次数
 * @create 2019/4/3-21:48
 */
public class ArrayNumof1Between1ToN {
    public int NumberOf1Between1AndN_Solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1;i<n+1;i++){
            sb.append(i);
        }
        int count = 0;
        for (int k = 0;k<sb.length();k++){
            if(sb.charAt(k)=='1'){
                count++;
            }
        }
        return count;
    }
}
