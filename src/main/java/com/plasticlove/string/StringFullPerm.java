package com.plasticlove.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author luka-seu
 * @description 输入一个字符串, 按字典序打印出该字符串中字符的所有排列
 * @create 2019/4/3-18:15
 */
public class StringFullPerm {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList();
        if(str==null||str.length()==0){
            return list;
        }
        HashSet<String> set = new HashSet();
        fun(set,str.toCharArray(),0);
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
    public void fun(HashSet<String> set,char[] charArr,int start){
        if(start==charArr.length){
            set.add(new String(charArr));
            return;
        }

        for(int i = 0;i<charArr.length;i++){
            swap(charArr,start,i);
            fun(set,charArr,start+1);
            swap(charArr,start,i);
        }
    }

    public void swap(char[] str, int i, int j) {
        if (i != j) {
            char t = str[i];
            str[i] = str[j];
            str[j] = t;
        }
    }
}
