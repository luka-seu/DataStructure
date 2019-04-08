package com.plasticlove.string;

/**
 * @author luka-seu
 * @description 一个函数用来判断字符串是否表示数值（包括整数和小数）
 * @create 2019/4/8-14:05
 */
public class StringIsNumeric {
    public boolean isNumeric(char[] str){
        try {
            double db = Double.parseDouble(new String(str));
        }catch (Exception e){
            return false;
        }
        return true;

    }
}
