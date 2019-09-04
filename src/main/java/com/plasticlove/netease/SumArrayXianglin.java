package com.plasticlove.netease;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 * @create 2019/8/3-15:45
 */
public class SumArrayXianglin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int time = 0;
        String[] strs = new String[t];
        while (time<t){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int m = 0;m<n;m++){
                arr[m] = sc.nextInt();
            }
            ArrayList<int[]> set = new ArrayList<>();
            fullPerm(arr,0,set);
            boolean flag = false;
            for (int[] array:set){
                if (getResult(array).equals("YES")){
                    flag = true;
                    break;
                }
            }
            if (flag){
                strs[time] = "YES";
            }else {
                strs[time] = "NO";
            }
            time++;

        }
        for (String s:strs){
            System.out.println(s);
        }

    }
    public static String getResult(int[] arr){

        boolean flag1 = true;
        int len = arr.length;
        if (len<=2){
            return "NO";
        }
        for (int k = 0;k<len;k++){
            if (k==0){
                if (arr[len-1]+arr[k+1]<=arr[k]){
                   flag1 = false;
                   break;

                }
                continue;
            }
            if (k==len-1){
                if (arr[k-1]+arr[0]<=arr[k]){
                    flag1 = false;
                    break;
                }
                continue;
            }
            if (arr[k-1]+arr[k+1]<=arr[k]){
                flag1 = false;
                break;
            }


        }
        if (flag1) {
            return "YES";
        }else {
            return "NO";
        }

    }

    public static void fullPerm(int[] arr, int start, ArrayList<int[]> ints){

        if (start==arr.length-1){
            int[] B = arr.clone();
            ints.add(B);
            return;
        }

        for (int i = start;i<=arr.length-1;i++){
            swap(arr,start,i);
            fullPerm(arr,start+1,ints);
            swap(arr,start,i);
        }
    }

    public static void swap(int[] A, int i, int j)
    {
        if (i!=j) {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
    }
}
