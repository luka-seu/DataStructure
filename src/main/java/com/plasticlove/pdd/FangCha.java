package com.plasticlove.pdd;

import java.util.Arrays;
import java.util.Scanner;

public class FangCha {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int k = 0;k<n;k++){
//            arr[k] = sc.nextInt();
//        }
        int[] arr = {10,-1,0,1,3};
        String res = String.format("%.2f",getResult(arr));
        System.out.println(res);
    }
    //先求平均值，减去平均值的绝对值之和最小

    public static double getResult(int[] arr){
        int len = arr.length;
        Arrays.sort(arr);
        double minFc = Integer.MAX_VALUE;
        for (int i = 0;i<len-2;i++){
            double fc = getFc(arr[i],arr[i+1],arr[i+2]);
            if (fc<minFc){
                minFc = fc;
            }
        }
        return minFc;
    }
    public static double getAvg(double a, double b,double c){
        return (a+b+c) / 3;
    }
    public static double getFc(int a, int b,int c){
        double avg = getAvg(a, b, c);
        double fc = (a-avg)*(a-avg)+(b-avg)*(b-avg)+Math.abs(c-avg)*(c-avg);
        return fc / 3.0;
    }
}
