package com.plasticlove.string;

import org.junit.Test;

/**
 * @author luka-seu
 * @description 反转句子
 * @create 2019/4/4-14:03
 */
public class StringReverseSentence {
    public String ReverseSentence(String str) {
        if ("".equals(str)||null==str){
            return "";
        }
        if (str.trim().equals("") ){
            return str;
        }
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }

        return sb.toString().substring(0,sb.length()-1);
    }

    @Test
    public void test(){
        String str = " ";
        System.out.println(this.ReverseSentence(str));
    }
}
