package com.plasticlove.array;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/9-19:29
 */
public class StudentCho {
    public static long getFangan(int n){
        if (n<6){
            return 0;
        }
        if (n==6){
            return 1 ;
        }
        long result = 1;
        for (int i = 0;i<n-6;i++){
            result = (result*2)%666666666;
        }
        // BigDecimal Math.pow(2,n-6)%666666666);
        // int result= (int)();
        return result;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        System.out.println(getFangan(10000));

    }
}
