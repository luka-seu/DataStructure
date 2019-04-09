package com.plasticlove.string;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description 输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。
 * @create 2019/4/9-16:09
 */
public class StringTickets {
    public static  String getTickets(String[] names,String[] votes){
        StringBuilder sb = new StringBuilder();
        int[] tickets = new int[names.length];
        for (int i = 0;i<names.length;i++){
            for (int k = 0;k<votes.length;k++){
                if (votes[k].equals(names[i])){
                    tickets[i]++;
                }
            }
            sb.append(names[i]+":"+tickets[i]);
        }
        int sum = 0;
        for (int m = 0;m<tickets.length;m++){
            sum = sum+tickets[m];
        }
        if (sum<votes.length){
            int invalid = votes.length-sum;
            sb.append("Invalid:"+invalid);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        String[] names =  new String[nums];
        for (int i = 0;i<nums;i++){
            names[i]=sc.next();
        }
        int votenums = sc.nextInt();
        String[] votes = new String[votenums];
        for (int m = 0;m<votenums;m++){
            votes[m] = sc.next();
        }
        String result = getTickets(names,votes);
        System.out.println(result);
    }
}
