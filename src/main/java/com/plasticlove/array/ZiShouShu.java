package com.plasticlove.array;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description 自守数是指一个数的平方的尾数等于该数自身的自然数。例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。请求出n以内的自守数的个数
 * @create 2019/4/9-15:10
 */
public class ZiShouShu {

    public static boolean getNums(int n){

        String str = String.valueOf(n);
        long pf = n*n;
        String pfstr = String.valueOf(pf);
        if (pfstr.substring(pfstr.length()-str.length()).equals(str)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(getNums(n));
        }
    }
}
