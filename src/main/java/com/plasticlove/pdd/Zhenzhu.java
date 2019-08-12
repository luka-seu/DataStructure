package com.plasticlove.pdd;

import java.util.Arrays;
import java.util.Scanner;

public class Zhenzhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0;k<n;k++){
            arr[k] = sc.nextInt();
        }

        Arrays.sort(arr);
        if ((arr[n-1] <= m / 2)||(arr[0] >= m /2)){
            System.out.println(getResult(arr));

        }else {
            int a = getResult(arr);
            changeNum(arr,m);
            int b = getResult(arr);
            System.out.println(a<b?a:b);

        }



    }
    //第一种是移到中位数

    public static int getResult(int[] arr){
        int len = arr.length;
        Arrays.sort(arr);
        int midPos = (len-1)/2;
        int mid = arr[midPos];
        int count = 0;
        //左边
        for (int k = midPos-1;k>=0;k--){
            int step1 = (mid - midPos+k) - arr[k];
            count = count + step1;
        }
        //右边
        for (int k = midPos+1;k<len;k++){
            int step2 = arr[k] - (k-midPos+mid);
            count = count + step2;
        }
        return count;


    }
    public static void changeNum(int[] arr, int m){
        int mid = m / 2;
        for (int k = 0;k<arr.length;k++){
            if (arr[k]<=mid){
                arr[k] = m+arr[k];
            }
        }
    }
}
