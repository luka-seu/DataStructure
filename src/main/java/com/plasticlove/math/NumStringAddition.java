package com.plasticlove.math;

import org.junit.Test;

/**
 * 字符串形式的数值相加
 */
public class NumStringAddition {

    public String addString(String s1,String s2){
        int carry = 0;
        int i = s1.length()-1;
        int j = s2.length()-1;
        StringBuilder sb = new StringBuilder();
        while(carry==1||i>=0||j>=0){
            //s1还没有加完
            int x = i < 0 ? 0 : s1.charAt(i) - '0';
            int y = j < 0 ? 0 : s2.charAt(i) - '0';
            sb.append((x+y+carry) % 10);
            carry = (x+y+carry) / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
    @Test
    public void test(){
        System.out.println(this.addString("118","991"));
    }
}
