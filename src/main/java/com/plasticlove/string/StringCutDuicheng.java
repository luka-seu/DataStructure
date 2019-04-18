package com.plasticlove.string;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description 截取最大对称字符串
 * @create 2019/4/10-14:23
 */
public class StringCutDuicheng {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String code = sc.next();
            System.out.println(cut(code));
        }
    }

    public static String cut(String str){

        StringBuilder sb = new StringBuilder();
        for (int k = str.length()-1;k>=0;k--){
            sb.append(str.charAt(k));
        }
        String reverse = sb.toString();
        for (int len = str.length();len>=1;len--){
            for (int i = 0;i<=str.length()-len;i++){
                if (str.contains(reverse.substring(i,i+len))){
                    return reverse.substring(i,i+len);
                }
            }
        }


        return null;
    }
}
