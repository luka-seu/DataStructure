package com.plasticlove.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author luka-seu
 * @description 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个
 * @create 2019-04 03-23:03
 **/

public class ArraySmallestPartionNum {
    public String PrintMinNumber(int [] numbers) {
        String [] numStr = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<numbers.length;i++){
            numStr[i] = String.valueOf(numbers[i]);

        }
        Arrays.sort(numStr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                /**
                 * 如果s1+s2>s2+s1说明s1应该放在前面
                 */
                String c1 = s1+s2;
                String c2 = s2+s1;
                int result = c1.compareTo(c2);
                return result;
            }
        });
        for (String s:numStr){
            sb.append(s);
        }
        return sb.toString();
    }

    @Test
    public void test(){
        int[] arr = {12,56,32,4,5};
        System.out.println(this.PrintMinNumber(arr));

    }
}
