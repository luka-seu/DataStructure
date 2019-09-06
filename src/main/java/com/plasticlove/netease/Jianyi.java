package com.plasticlove.netease;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 * @create 2019/8/3-16:42
 */
public class Jianyi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] datas = new int[n];
        for (int i = 0;i<n;i++){
            datas[i] = sc.nextInt();
        }
        int[] qs = new int[q];
        int[] result = new int[q];
        for (int k = 0;k<q;k++){
            qs[k] = sc.nextInt();
            result[k] = getResult(datas,qs[k]);

        }

        for (int r : result){
            System.out.println(r);
        }
    }

    public static int getResult(int[] arr,int num){
        int count = 0;
        for (int i :arr){
            if (i>=num){
                count++;
            }
        }
        return count;
    }
}
