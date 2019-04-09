package com.plasticlove.string;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description 将一个字符中所有出现的数字前后加上符号“*”，其他字符保持不变
 * @create 2019/4/9-15:30
 */
public class StringAddSymbol {
    public static String addSymbol(String str,char ch){
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i)<='9'&&str.charAt(i)>='0'){

                sb.append(ch).append(str.charAt(i)).append(ch);
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(addSymbol(s,'*'));
    }
}
