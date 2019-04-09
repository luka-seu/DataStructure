package com.plasticlove.csdn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description 首先输入要输入的整数个数n，然后输入n个整数。输出为n个整数中负数的个数，和所有正整数的平均值，结果保留一位小数。
 * @create 2019/4/9-15:19
 */
public class NumsAndMeans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> zhengshu = new ArrayList<>();
        int count = 0;
        for (int i = 0;i<n;i++){
            int num = sc.nextInt();
            if (num<0){
                count++;
            }else if (num>0){
                zhengshu.add(num);
            }
        }
        //保留多少位小数时不能用int
        double sum = 0;
        for (int m = 0;m<zhengshu.size();m++){
            sum+=zhengshu.get(m);
        }
        System.out.print(count+" ");
        //printf保留多少位小数
        System.out.printf("%.1f\n",sum/zhengshu.size());

    }
}
