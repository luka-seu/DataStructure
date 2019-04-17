package com.plasticlove.string;

import org.junit.Test;

/**
 * @author luka-seu
 * @description 最长不重复子串
 * @create 2019/4/17-17:53
 */
public class StringMaxNotReaptableSubString {

    @Test
    public void test(){
        String str = "dajdiquwerqjfkfhajsdjasdjqwhqiodfhajkdfhasjdjdqwdjfhasdjfqwilhd";
        System.out.println(getResult(str));
    }


    public int getResult(String str){
        int [] letters = new int[26];
        for (int i = 0;i<letters.length;i++){
            letters[i] = -1;
        }
        int maxLen = 0;
        int curLen = 0;
        for (int k = 0;k<str.length();k++){
            int index = letters[str.charAt(k)-'a'];
            //如果没有出现过或者出现的距离之差大于当前长度
            if (index<0||index-k>curLen){
                curLen++;
            }else{
                //处理的上面的if语句的curLen转变为最大长度
                if (curLen>maxLen){
                    maxLen = curLen;
                }
                curLen = maxLen;
            }


            //下标是字符，值是出现的索引
            letters[str.charAt(k)-'a'] = k;
        }
        if (curLen>maxLen){
            maxLen = curLen;
        }
        return maxLen;

    }
}
