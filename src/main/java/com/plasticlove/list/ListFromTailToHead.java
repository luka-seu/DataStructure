package com.plasticlove.list;

import java.util.ArrayList;

/**
 * @author luka-seu
 * @description 从尾到前遍历链表
 * @create 2019/4/3-17:54
 */
public class ListFromTailToHead {
    ArrayList list = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(Node listNode) {

        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.data);
        }
        return list;
    }
}
