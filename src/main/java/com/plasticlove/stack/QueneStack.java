package com.plasticlove.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @author luka-seu
 * @description 队列实现栈
 * @create 2019-08 30-18:24
 **/

public class QueneStack {
    public static void main(String[] args) {
        QueneStack stack = new QueneStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
    }
    //两个队列实现栈


    private Queue<Integer> data;
    private Queue<Integer> help;

    public QueneStack(){
        this.data = new LinkedList<>();
        this.help = new LinkedList<>();
    }

    /**
    将data队列全部放入help队列中，只留一个元素
    */
    public int pop(){
        while (data.size()>1){
            help.add(data.poll());
        }

        int res = data.poll();
        this.swap();
        return res;
    }

    /**
     * 改变引用
     */
    private void swap() {
        LinkedList temp = (LinkedList) help;
        help = data;
        data = temp;

    }

    public int push(int value){
        data.add(value);
        return value;
    }



}
