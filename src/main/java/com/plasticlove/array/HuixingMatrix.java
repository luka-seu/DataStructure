package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 打印回型矩阵
 * @create 2019/4/17-16:03
 */
public class HuixingMatrix {


    public static int[][]  getResult(int n){
        int[][] arr = new int[n][n];
        int i = 0;
        int j = 0;
        int t = 1;
        for (int k =0;k<n/2;k++){
            for (i=k,j=k;j<n-k-1;j++){
                arr[i][j] = t++;
            }
            for (i=k,j=n-k-1;i<n-k-1;i++){
                arr[i][j] = t++;
            }
            for (i=n-k-1,j=n-k-1;j>k;j--){
                arr[i][j] = t++;
            }
            for (i=n-k-1,j=k;i>k;i--){
                arr[i][j] = t++;
            }
        }
        if (n%2==1){
            arr[n/2][n/2] = t;
        }
        return arr;
    }
}
