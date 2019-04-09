package com.plasticlove.string;

import java.util.ArrayList;

/**
 * @author luka-seu
 * @description 题目描述
 * 计算 24 点是一种扑克牌益智游戏，随机抽出 4 张扑克牌，通过加 (+) ，减 (-) ，乘 ( * ),  除 (/) 四种运算法则计算得到整数 24 ，本问题中，扑克牌通过如下字符或者字符串表示，其中，小写 joker 表示小王，大写 JOKER 表示大王：  
 * 3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER
 * 本程序要求实现：输入 4 张牌，输出一个算式，算式的结果为 24 点。  
 * 详细说明：  
 * 1. 运算只考虑加减乘除运算，没有阶乘等特殊运算符号， 友情提醒，整数除法要当心 ；  
 * 2. 牌面 2~10 对应的权值为 2~10, J 、 Q 、 K 、 A 权值分别为为 11 、 12 、 13 、 1 ；  
 * 3. 输入 4 张牌为字符串形式，以 一个空格 隔开，首尾无空格；如果输入的 4 张牌中包含大小王，则输出字符串“ ERROR ”，表示无法运算；  
 * 4. 输出的算式格式为 4 张牌通过 +-/* 四个运算符相连， 中间无空格 ， 4张牌出现顺序任意，只要结果正确；  
 * 5.输出算式的运算顺序从左至右，不包含括号 ，如 1+2+3*4的结果为 24
 * 6.如果存在多种算式都能计算得出 24 ，只需输出一种即可，如果无法得出 24 ，则输出“ NONE ”表示无解。
 * 输入描述:
 * 输入4张牌为字符串形式，以一个空格隔开，首尾无空格；
 * 输出描述:
 * 如果输入的4张牌中包含大小王，则输出字符串“ERROR”，表示无法运算；
 * @create 2019/4/9-21:18
 */
public class Poker24Points {
    public String get24Points(String[] strArr){
        String result = "";
        int[] pokers = new int[4];
        for (int i = 0;i<strArr.length;i++){
            if (strArr[i].equals("joker")||strArr[i].equals("JOKER")){
                result = "ERROR";
                break;
            }
            if (strArr[i].equals("J")){
                pokers[i] = 11;
            }else if(strArr[i].equals("Q")){
                pokers[i] = 12;
            }else if(strArr[i].equals("K")){
                pokers[i] = 13;
            }else if(strArr[i].equals("A")){
                pokers[i] = 1;
            }else{
                pokers[i] = Integer.valueOf(strArr[i]);
            }
        }




    }

    public static String getTotalSum(ArrayList<int[]> ints){

    }


    public static int getNum(int a,int b,char operator){
        switch (operator){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;


        }
        return 0;
    }
    public static ArrayList<int[]> permutation(int[] arr){
        ArrayList<int[]> ints = new ArrayList<>();
        for (int i = 0;i<4;i++){
            for (int j = 0;j<4;i++){
                if (j==i){
                    continue;
                }
                for (int m = 0;m<4;m++){
                    if (m==j){
                        continue;
                    }
                    for (int n = 0;n<4;n++){
                        if (n==m){
                            continue;
                        }
                        int[] temp = new int[]{arr[i],arr[j],arr[m],arr[n]};
                        ints.add(temp);
                    }
                }
            }
        }
        return ints;
    }
}
