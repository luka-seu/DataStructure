package com.plasticlove.leetcode;

import java.util.Stack;

/**
 * @author luka-seu
 * @description
 * @create 2019-09 07-01:02
 **/


//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
// 注意空字符串可被认为是有效字符串。
//
// 示例 1:
//
// 输入: "()"
//输出: true
//
//
// 示例 2:
//
// 输入: "()[]{}"
//输出: true
//
//
// 示例 3:
//
// 输入: "(]"
//输出: false
//
//
// 示例 4:
//
// 输入: "([)]"
//输出: false
//
//
// 示例 5:
//
// 输入: "{[]}"
//输出: true
// Related Topics 栈 字符串

public class Valid_parentheses_20 {

    public boolean isValid(String s) {
        //空字符串
        if (null == s || s.length() == 0) {
            return true;
        }
        //用栈压左括号
        Stack<String> stack = new Stack<>();
        char[] chs = s.toCharArray();
        boolean flag = true;
        for (int k = 0; k < chs.length; k++) {
            if (chs[k] == ')' || chs[k] == ']' || chs[k] == '}') {
                //括号不匹配
                if (stack.isEmpty() || !this.isPairPatentheses(stack.pop(), String.valueOf(chs[k]))) {
                    flag = false;
                    break;
                }
            } else {
                stack.push(String.valueOf(chs[k]));
            }
        }
        //左括号多于右括号
        if (!stack.isEmpty()) {
            flag = false;
        }
        return flag;
    }

    public boolean isPairPatentheses(String fir, String sec) {
        if (sec.equals(")")) {
            return fir.equals("(");
        }
        if (sec.equals("}")) {
            return fir.equals("{");
        }
        if (sec.equals("]")) {
            return fir.equals("[");
        }
        return true;
    }
}
