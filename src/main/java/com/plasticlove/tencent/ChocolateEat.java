package com.plasticlove.tencent;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description 小Q的父母要出差N天，走之前给小Q留下了M块巧克力。小Q决定每天吃的巧克力数量不少于前一天吃的一半，但是他又不想在父母回来之前的某一天没有巧克力吃，请问他第一天最多能吃多少块巧克力
 * @create 2019/4/4-20:08
 */
public class ChocolateEat {
    public static long getResult(int days,int nums){
        // int temp = 0;
        // for (int i = 0;i<days-1;i++){
        //     temp = (int) (temp+Math.pow(2,i));
        // }
        long pre = (long) Math.pow(2,days-1);
        long end = (long) (nums/(2-Math.pow(2,1-days)));


        return end;
    }
    //第一天吃firstDay个巧克力，到第days天至少总共吃了多少
    public static int getTotalInDays(int firstDay,int days){
        int sum = 0;
        for (int i = 1;i<days+1;i++){
            //向上取整，因为后一天要比前一天的1/2要多
            sum = (int) (sum+Math.ceil(firstDay/Math.pow(2,i-1)));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int days = sc.nextInt();
            int nums = sc.nextInt();
            int firstDay = 1;
            int tempNum = nums;
            //二分查找的方法，第一天吃多少才能满足最后总数不超过
            while(firstDay<nums){
                int mid = (int) Math.ceil((firstDay+tempNum)/2);
                if (getTotalInDays(mid,days)>nums){
                    tempNum = mid-1;
                }else if(getTotalInDays(mid,days) == nums){

                    firstDay = mid;
                    break;
                }else{
                    firstDay = mid;
                }

            }
            System.out.println(firstDay);
        }
    }
}
