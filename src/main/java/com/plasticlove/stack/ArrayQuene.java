package com.plasticlove.stack;

/**
 * @author luka-seu
 * @description 数组实现队列
 * @create 2019-08 30-17:12
 **/

public class ArrayQuene {

    public static void main(String[] args) {
        ArrayQuene quene = new ArrayQuene(3);
        quene.push(1);
        quene.push(2);
        quene.push(3);
        System.out.println(quene.poll());
        System.out.println(quene.poll());
        System.out.println(quene.poll());
        System.out.println(quene.poll());
    }


    /**
     * 出队元素位置
     */
    private int start;
    /**
     * 入队元素位置
     */
    private int end;

    private int[] quene;
    /**
     * 当前队列长度
     */
    private int size;

    public ArrayQuene(int initSize){
        this.quene = new int[initSize];
        this.start = 0;
        this.end = 0;
        this.size = 0;
    }

    public int push(int value){
         if (size==quene.length){
             //队列满
             return -1;
         }
         size++;
         quene[end] = value;
         //到达数组最后一个位置，end回到队首
         end = end==quene.length?0:end+1;
         return value;
    }

    public int poll(){
        if (size==0){
            //空队列
            return -2;
        }
        --size;
        int temp = start;
        start = start==quene.length?0:start+1;
        return quene[temp];
    }


}
