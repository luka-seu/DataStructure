package com.plasticlove.stack;

import java.util.Stack;

/**
 * @author luka-seu
 * @description 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * @create 2019/4/3-18:10
 */
public class StackDef {
    Stack<Integer> data = new Stack();
    Stack<Integer> min = new Stack();
    public void push(int node) {
        data.push(node);
        if(min.isEmpty()||node<min.peek()){
            min.push(node);
        }else{
            min.push(min.peek());
        }
    }

    public void pop() {
        data.pop();
        min.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}
