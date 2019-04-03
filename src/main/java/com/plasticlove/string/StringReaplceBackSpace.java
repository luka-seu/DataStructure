package com.plasticlove.string;

/**
 * @author luka-seu
 * @description 替换空格
 * @create 2019/4/3-17:53
 */
public class StringReaplceBackSpace {
    public static String replaceSpace(StringBuffer str) {

        for (int i = 0;i<str.length();i++){
            if (str.charAt(i)==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
}
