package com.plasticlove.netease;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 * @create 2019/8/3-14:23
 */
public class LiveLong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nums = str.split(" ");
        System.out.println(getResult(Integer.valueOf(nums[1]),Integer.valueOf(nums[2]),Integer.valueOf(nums[3]),Integer.valueOf(nums[4])));
    }
    public static int getResult(int x,int f,int d,int p){
        if(d<=f*x){
            return f;
        }
        int result = (d-(f*x))/(p+x);
        return result;
    }
}
