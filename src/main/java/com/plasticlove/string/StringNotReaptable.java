package com.plasticlove.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author luka-seu
 * @description 在一个字符串(0 < = 字符串长度 < = 10000 ， 全部由字母组成)中找到第一个只出现一次的字符, 并返回它的位置, 如果没有则返回 -1（需要区分大小写）
 * @create 2019-04 04-00:38
 **/

public class StringNotReaptable {
    public int FirstNotRepeatingChar(String str) {
        if (str==null||str.length()==0){
            return -1;
        }

        HashMap<Character,Integer> mapCount = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            if (mapCount.containsKey(str.charAt(i))){
                int value = mapCount.remove(str.charAt(i));
                mapCount.put(str.charAt(i),value+1);
            }else{
                mapCount.put(str.charAt(i),1);
            }
        }

        for (int i = 0;i<str.length();i++){
            if (mapCount.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;


    }
}
