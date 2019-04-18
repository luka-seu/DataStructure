package com.plasticlove.string;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description 超长正整数相加
 * @create 2019/4/10-16:32
 */
public class StringBigDataAdd {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(sum(s1,s2));
    }

    public static String sum(String s1,String s2){
        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = new BigInteger(s2);
        return n1.add(n2).toString();
    }
}
