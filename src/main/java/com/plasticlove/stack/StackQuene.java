package com.plasticlove.stack;

import java.util.Stack;

/**
 * @author luka-seu
 * @description 栈实现队列
 * @create 2019-08 30-17:13
 **/

public class StackQuene {

    public static void main(String[] args) {
        StackQuene quene = new StackQuene();
        quene.push(1);
        quene.push(2);
        quene.push(3);
        quene.push(4);
        System.out.println(quene.poll());
        System.out.println(quene.poll());
        System.out.println(quene.poll());
        System.out.println(quene.poll());
        System.out.println(quene.poll());
    }
    /**
     * 两个栈实现队列
     */

    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;


    public StackQuene(){
        this.pushStack = new Stack<>();
        this.popStack = new Stack<>();
    }
    public int push(int value){
        return pushStack.push(value);
    }
    public int poll(){
        if (!popStack.isEmpty()){
            return popStack.pop();
        }
        while(!pushStack.isEmpty()){
            popStack.push(pushStack.pop());
        }
        return popStack.pop();
    }

}
