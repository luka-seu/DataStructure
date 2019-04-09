package com.plasticlove.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author luka-seu
 * @description 在字符串中找出连续最长的数字串
 * @create 2019/4/9-17:16
 */
public class LongestNumberSubstring {
    public static String[] getLongestNumbers(String str) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i<str.length()){
            //记录当前的开始位置
            int j = i;
            while (j<str.length()&&str.charAt(j)<='9'&&str.charAt(j)>='0'){
                j++;
            }
            if (j!=i){
                String temp = str.substring(i,j);
                list.add(temp);
                i= j+1;
            }else{
                i++;
            }

        }
        int max = 0;
        //获取最大长度
        for (String s:list){
            if (s.length()>max){
                max = s.length();
            }
        }
        //获取最大长度的字符串
        StringBuilder sb = new StringBuilder();
        for (String s:list){
            if (s.length()==max){
                sb.append(s);
            }
        }
        String[] result = new String[2];
        result[0] = sb.toString();
        result[1] = String.valueOf(max);
        return result;

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String str = "dadasd34d3212323sddasda";
        String[] longestNumbers = getLongestNumbers(str);
        System.out.println(longestNumbers[0]+","+longestNumbers[1]);
    }
}
