package com.plasticlove.xiaomi;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiddleTreePrint {
    static class Node{
        public int data;
        public Node left;
        public Node right;
        public Node(int data){
            this.data = data;
        }
    }


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String solution(String input) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        char[] chars = input.toCharArray();
        for (int k =0 ;k<chars.length;k++){
            if (chars[k]=='('||chars[k]==')'){
                continue;
            }else if (chars[k]==','){
                if(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                if (!stack.isEmpty()&&chars[k-1]!='('){
                    sb.append(stack.pop());
                }
            }else{
                stack.push(String.valueOf(chars[k]));
            }

        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();


    }



    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }

        res = solution(_input);
        System.out.println(res);
    }
}
