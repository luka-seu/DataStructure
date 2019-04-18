package com.plasticlove.huawei;

import java.util.Scanner;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/10-19:37
 */
public class kuohao {
    public static void main(String[] args) {
        String s = "abc3(3(4(A)))asda4(c)6{4[3(EEE)]}";
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        System.out.println(getString(s));
    }

    public static String helper(String[] nums,int len,String init){
        StringBuilder sb = new StringBuilder();
        String temp = init;
        for (int i = len-1;i>=0;i--){
            sb.delete(0,sb.length());
            int numstemp = Integer.valueOf(nums[i]);
            for (int k = 0;k<numstemp;k++){

                sb.append(temp);
            }
            temp = sb.toString();
        }
        return sb.toString();

    }


    public static String getString(String str){
        // char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<str.length();i++){



            char c = str.charAt(i);
            if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                sb.append(c);
                continue;
            }
            if (c>='0'&&c<='9'){
                int j = i+1;
                while(str.charAt(j)>='0'&&str.charAt(j)<='9'){
                    j++;
                }
                // String nums = str.substring(i,j);
                int k = i+1;
                while (str.charAt(k)<'A'||(str.charAt(k)>'Z'&&str.charAt(k)<'a')||str.charAt(k)>'z'){
                        k++;
                    }
                int p = k;
                while (str.charAt(p)!=')'&&str.charAt(p)!=']'&&str.charAt(p)!='}'){
                            p++;
                      }
                String init = str.substring(k,p);
                String symbol = str.substring(i,k);
                String[] ns = symbol.split("\\(|\\[|\\{");
                String s = helper(ns, ns.length, init);
                sb.append(s);
                i = p;


            }


            }
        return sb.reverse().toString();
        }


}
