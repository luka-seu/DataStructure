package com.plasticlove.string;

/**
 * @author luka-seu
 * @description 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @create 2019/4/4-15:42
 */
public class StringSumWithoutSymbol {
    public int Add(int num1,int num2) {
        if(num2>=0){
            for(int i = 0;i<num2;i++){
                num1++;
            }

        }else{
            for(int i = 0;i>num2;i--){
                num1--;
            }
        }
        return num1;

    }
}
