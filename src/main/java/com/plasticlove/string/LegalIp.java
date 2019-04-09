package com.plasticlove.string;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 *
 * 题目描述
 * 现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此不需要用正号出现），如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。
 * 现在需要你用程序来判断IP是否合法。
 * 输入描述:
 * 输入一个ip地址
 * 输出描述:
 * 返回判断的结果YES or NO
 *
 *
 * 合法的ip是数字.数字.数字.数字(范围>=0,<=255)
 * @create 2019/4/9-21:05
 */
public class LegalIp {
    public static void checkIp(String ip){
        //如果包含空格
        if (ip.contains(" ")){
            System.out.println("NO");
            return;
        }
        //点.必须在转义
        String[] ipParts = ip.split("\\.");
        if (ipParts.length!=4){
            System.out.println("NO");
            return;
        }
        boolean flag = true;
        for (int i = 0;i<ipParts.length;i++){
            if (Integer.valueOf(ipParts[i])<0||Integer.valueOf(ipParts[i])>255){
                flag = false;
                break;

            }
        }
        if (flag) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        // String ip = "10.10.10.10";
        checkIp(ip);
    }
}
