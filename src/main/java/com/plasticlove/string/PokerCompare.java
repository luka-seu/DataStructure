package com.plasticlove.string;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description 扑克牌比较大小
 * @create 2019/4/10-13:21
 */
public class PokerCompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] pokerStrArr = str.split("-");
        System.out.println(comparePoker(pokerStrArr[0],pokerStrArr[1]));
    }

    public static String comparePoker(String poker1,String poker2){



        if (poker1.equals("joker JOKER")||poker2.equals("joker JOKER")){
            return "joker JOKER";
        }else if (poker1.length()==7&&poker2.length()!=7){
            return poker1;
        }else if (poker2.length()==7&&poker1.length()!=7){
            return poker2;
        }else if (poker1.length()!=poker2.length()){
            return "ERROR";
        }else{

            String[] s1 = poker1.split(" ");
            String[] s2 = poker2.split(" ");
            HashMap<String,Integer> pokers = new HashMap<>();
            for (int i = 3;i<=10;i++){
                pokers.put(String.valueOf(i),i);
            }
            pokers.put("J",11);
            pokers.put("Q",12);
            pokers.put("K",13);
            pokers.put("A",14);
            pokers.put("2",15);
            pokers.put("joker",16);
            pokers.put("JOKER",17);

            if (pokers.get(s1[0])>pokers.get(s2[0])){
                return poker1;
            }else{
                return poker2;
            }
        }
    }
}
