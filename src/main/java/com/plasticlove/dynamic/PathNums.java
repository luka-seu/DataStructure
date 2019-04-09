package com.plasticlove.dynamic;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 * 请编写一个函数（允许增加子函数），
 * 计算n x m的棋盘格子（n为横向的格子数，m为竖向的格子数）
 * 沿着各自边缘线从左上角走到右下角，总共有多少种走法，
 * 要求不能走回头路，即：只能往右和往下走，不能往左和往上走。
 * @create 2019/4/9-18:02
 */
public class PathNums {
    /**
     * 将右下角看做原点(0, 0)，左上角看做坐标(m, n)，从(m, n)—>(0, 0)就分两步走：
     * f(m, n - 1)—>(0, 0) 或f(m - 1, n)—>(0, 0)
     * 注意：但凡是触碰到边界，f(x, 0)或者f(0,x)都只有一条直路可走
     * f(m, n) = f(m, n - 1) + f(m - 1, n)
     * @param rows
     * @param cols
     * @return
     */
    public static int getPaths(int rows,int cols){
        // if (rows<1||cols<1){
        //     return 0;
        // }
        // else if (rows==1&&cols>1){
        //     return 1;
        // }else if (rows>1&&cols==1){
        //     return 1;
        // }
        if (rows==1||cols==1){
            return 1;
        }
        int i = getPaths(rows - 1, cols) + getPaths(rows, cols - 1);
        return i;

    }
    //动态规划
    public static int getPaths2(int rows,int cols){
        int[][] dp = new int[rows+1][cols+1];
        for (int i = 0;i<=cols;i++){
            dp[0][i] = 1;
        }
        for (int j = 0;j<=rows;j++){
            dp[j][0] = 1;
        }
        for (int m = 1;m<=rows;m++){
            for (int n = 1;n<cols;n++){
                dp[m][n] = dp[m-1][n]+dp[m][n-1];
            }
        }
        return dp[rows-1][cols-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println(getPaths2(rows,cols));
    }
}
