package com.plasticlove.string;

/**
 * @author luka-seu
 * @description 字符串的循环移位
 * @create 2019/4/3-21:17
 */
public class StringCyclicMove {
    //循环左移
    public static String moveLeft(String str,int index){
        if (index>str.length()){
            index = index%str.length();
        }
        String temp = str+str;
        return temp.substring(index,index+str.length());
    }

    //循环右移
    public static String moveRight(String str,int index){
        if (index>str.length()){
            index = index%str.length();
        }
        String temp = str+str;
        return temp.substring(temp.length()-str.length()-index,temp.length()-index);
    }



    //test
    public static void main(String[] args) {
        String test = "abc";
        String s = moveRight(test,2);
        System.out.println(s);
    }
}
