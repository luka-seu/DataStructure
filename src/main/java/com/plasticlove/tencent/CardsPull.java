package com.plasticlove.tencent;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author luka-seu
 * @description 抽纸牌
 * @create 2019/4/4-19:28
 */
public class CardsPull {
    public static int getResult(int[] arr){
        int len = arr.length;
        Arrays.sort(arr);
        Stack<Integer> stack = new Stack<>();
        for (int i =0;i<len;i++){
            stack.push(arr[i]);
        }

        int niuSum = 0;
        int yangSum = 0;
        while(!stack.isEmpty()){
            niuSum = niuSum+stack.pop();
            if (!stack.isEmpty()){
                yangSum= yangSum+stack.pop();
            }
        }
        return niuSum-yangSum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        for(int i = 0;i<n;i++){
            cards[i] = sc.nextInt();
        }
        int result = getResult(cards);
        System.out.println(result);
    }


}
