package com.plasticlove.math;

import org.junit.Test;

/**
 * 二进制加法
 * a = "11"
 * b = "1"
 * a+b = "100"
 */
public class BinaryAddition {
    public String addBianry(String b1,String b2){
        int carry = 0;
        int i = b1.length()-1;
        int j = b2.length()-1;
        StringBuilder sb = new StringBuilder();
        //所有的都加在carry上
        while(carry==1||i>=0||j>=0){
            if (i>=0&&b1.charAt(i)=='1'){
                carry++;
            }
            if (j>=0&&b2.charAt(j)=='1'){
                carry++;
            }
            i--;
            j--;
            //carry = 2说明两个1相加，当前喂为零，进位为1
            sb.append(carry % 2);
            carry = carry / 2;
        }
        //需要反转，因为是从低位开始append的
        return sb.reverse().toString();
    }

    @Test
    public void test(){
        System.out.println(this.addBianry("11","1"));
    }
}
