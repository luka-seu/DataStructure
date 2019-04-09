package com.plasticlove.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/9-19:50
 */
public class WaterPool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stus = sc.nextInt();
        int waters = sc.nextInt();
        int[] arr = new int[2*stus];
        for (int i = 0;i<2*stus;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double temp = waters/(3.0*stus);
        if (temp>arr[0]){
            temp =arr[0];
        }
        if (2*temp>arr[stus]){
            temp = arr[stus]/2.0;
        }
        System.out.printf("%.6f\n",3*temp*stus);


    }
}
