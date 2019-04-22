package com.plasticlove.array;

import org.junit.Test;

/**
 * @author luka-seu
 * @description n皇后问题
 * @create 2019/4/22-13:49
 */
public class Queen {
    int n = 8;
    int[] rows = new int[n];
    int total = 0;

    public boolean is_ok(int row){
        for (int j = 0;j!=row;j++){
            //不在同一列，同一正对角线和副对角线
            if (rows[row]==rows[j]||rows[row]-row==rows[j]-j||rows[row]+row==rows[j]+j){
                return false;
            }
        }
        return true;
    }


    public void queen(int row){
        if (row==n){
            total++;
        }else{
            for (int col = 0;col!=n;col++){
                rows[row] = col;
                if (is_ok(row)){
                    queen(row+1);
                }
            }
        }
    }
    @Test
    public void test(){
        queen(0);
        System.out.println(total);
    }

}
