package com.plasticlove.netease;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 * @create 2019/8/3-15:15
 */
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0;i<n;i++){
            scores[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        double[] result = new double[q];
        for (int k = 0;k<q;k++){
            result[k] = getResult(scores,sc.nextInt());
        }
        for (double r : result){
            System.out.println(String.format("%.6f",r*100));
        }


    }

    public static double getResult(int[] scores,int num){
        double count = 0;
        for (int score:scores){
            if (score<=scores[num-1]){
                count++;
            }
        }
        return (count-1) / scores.length;
    }
}
