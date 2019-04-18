package com.plasticlove.array;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/10-14:45
 */
public class TwoDiemationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int rowInsert = sc.nextInt();
        int colInsert = sc.nextInt();
        int rowCheck = sc.nextInt();
        int colCheck = sc.nextInt();
        if(row<=9&&row>0&&col<=9&&col>0){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }

        if (row1>=0&&row1<row&&col1>=0&&col1<col&&row2>=0&&row2<row&&col2>=0&&col2<col){
            System.out.println(0);
        }else {
            System.out.println(-1);
        }

        if (rowInsert >= 0 && rowInsert < row)
            System.out.println(0);
        else
            System.out.println(-1);
        if (colInsert >= 0 && colInsert < col)
            System.out.println(0);
        else
            System.out.println(-1);
        if (rowCheck >= 0 && rowCheck < row && colCheck >= 0 && colCheck < col)
            System.out.println(0);
        else
            System.out.println(-1);

    }

}
