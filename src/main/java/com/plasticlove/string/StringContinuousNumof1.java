package com.plasticlove.string;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description 功能: 求一个byte数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
 * @create 2019/4/10-14:07
 */
public class StringContinuousNumof1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 81;
        System.out.println(getNums(n));
    }
    public static int getNums(int n){


        String s = Integer.toBinaryString(n);

        int max = 0;
        for (int i = 0;i<s.length();i++){
            // int count = 0;
            if (s.charAt(i)=='1') {
                int j = i+1;
                while (j < s.length()) {
                    if (s.charAt(j)=='1'){
                        j++;
                    }else{

                        break;
                    }
                }
                if (j-i>max){
                    max = j-i;
                }
                i = j;

            }
        }
        return max;
    }
}
