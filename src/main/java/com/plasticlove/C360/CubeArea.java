package com.plasticlove.C360;

import java.util.Scanner;

public class CubeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int k = 0;k<n;k++){
            for (int p = 0;p<m;p++){
                arr[k][p] = sc.nextInt();
            }
        }


        System.out.println(getResult(arr));
    }


    public static int getResult(int[][] arr){
        int col = arr[0].length;
        int row = arr.length;
        int colCom = 2 * (col-1)*row;
        int rowCom = 2 * (row-1)*col;
        int comUp = 0;
        int total = 0;
        for (int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                total = total + arr[i][j];
                if (arr[i][j]>=1){
                    comUp = comUp+2*(arr[i][j]-1);
                }
            }
        }
        return 6*total - (colCom+rowCom+comUp);
    }
}
