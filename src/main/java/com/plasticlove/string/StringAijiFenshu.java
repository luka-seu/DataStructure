package com.plasticlove.string;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 *
 * 题目描述：
 * 分子为1的分数称为埃及分数。现输入一个真分数(分子比分母小的分数，叫做真分数)，请将该分数分解为埃及分数。如：8/11 = 1/2+1/5+1/55+1/110。
 *
 * 输入描述:
 * 输入一个真分数，String型
 *
 * 输出描述:
 * 输出分解后的string
 *
 * 思路：
 *
 * 设a、b为互质正整数，a<b，分数a / b 可用以下的步骤分解成若干个单位分数之和：
 * 步骤一：用b除以a，得商数q及余数r（r=b-a*q）
 * 步骤二：a / b = 1 / (q+1) + (a-r) / b(q+1）
 * 步骤三：对于(a-r) / b(q+1)，重复一和二，直到分解完毕
 * @create 2019/4/10-15:18
 */
public class StringAijiFenshu {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // String[] strings = str.split("/");
        String[] strings = {"8","11"};

        System.out.println(cut(Integer.valueOf(strings[0]),Integer.valueOf(strings[1])));
    }

    public static String cut(int a,int b ){
        StringBuilder sb = new StringBuilder();
        while (a >= 1) {
            if (b%a==0){
                sb.append(1).append("/").append(b/a);
                break;
            }

            for (int i = 1, j = a - 1; i < j; i++, j--)
            {
                if (b % i == 0 && b % j == 0)
                {
                    sb.append(1).append("/").append(b / j).append("+").append(1).append("/").append(b / i);
                    return sb.toString();
                }
            }




            int q = b/a;
            int p = b%a;
            a = a-p;
            b = b*(q+1);
            sb.append(1).append("/").append(q + 1).append("+");
        }
        return sb.toString();
    }
}
