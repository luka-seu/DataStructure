package com.plasticlove.leetcode;
//[7]给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学


import org.junit.Test;

public class Reverse_integer_7 {
    @Test
    public void test() {
        System.out.println(this.reverse(123));
    }


    public int reverse(int x) {
        int ret = 0;
        while (x != 0) {
            int newRet = ret * 10 + (x % 10);
            //除回去判断是否越界
            if ((newRet - (x % 10)) / 10 != ret) {
                return 0;
            }
            x = x / 10;
            ret = newRet;
        }

        return ret;
    }
}

