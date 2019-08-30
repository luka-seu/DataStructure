package com.plasticlove.stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author luka-seu
 * @description 固定数组长度实现栈结构
 * @create 2019-08 30-15:36
 **/

public class ArrayStack {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }



    /**
     * push和pop的位置
     */
    private int index;
    private int[] arr;

    public ArrayStack(){

    }

    public ArrayStack(int initSize){
        //初始化数组
        this.arr = new int[initSize];
        this.index = 0;
    }

    public int push(int value){
        //如果index和数组的长度相等，说明不能再push了
        if (index==arr.length){
            return -1;
        }
        //在index处压栈，index指向栈顶的上一个位置
        arr[index++] = value;
        return value;
    }

    public int pop(){
        if (index==0){
            //栈为空
            return -2;
        }
        return arr[--index];

    }

}
