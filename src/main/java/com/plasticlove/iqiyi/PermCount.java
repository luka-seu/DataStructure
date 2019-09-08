package com.plasticlove.iqiyi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description 排列计数
 * @create 2019-09 08-15:18
 **/

public class PermCount {
    public static ArrayList<int[]> list = new ArrayList();

    public static void main(String[] args) {
        int[] arr = {1,1,0};
        int result = getResult(4, arr);
        System.out.println(result);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n-1];
//        for (int i = 0;i<n-1;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(getResult(n,arr));
    }

    public static int getResult(int n,int[] arr){
        int[] preArr = new int[n];
        for (int i = 1;i<=n;i++){
            preArr[i-1] = i;
        }
        fullPerm(preArr,0,list);
        int count = 0;
        for (int m = 0;m<list.size();m++) {
            boolean flag = true;
            int[] tempArr = list.get(m);
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == 0) {
                    if (tempArr[k]>tempArr[k+1]){
                     flag = false;
                     break;
                    }
                }else {
                    if (tempArr[k]<tempArr[k+1]){
                        flag = false;
                        break;
                    }
                }
            }
            if (flag){
                count++;
            }
        }
        return (int) (count % (Math.pow(10,9)+7));
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
