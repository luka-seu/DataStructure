package com.plasticlove.base;

import com.plasticlove.list.Node;

/**
 * @author luka-seu
 * @description 链表反转
 * @create 2019-09 10-22:01
 **/

public class ListReverse {

    public Node reverseList(Node head){
        Node cur = head;
        Node pre = null;
        while(cur!=null){
            //尾节点
            if (cur.next==null){
                return cur;
            }

            //保存当前节点的next节点
            Node next = cur.next;
            //当前节点指向上一个节点
            cur.next = pre;
            //上一个节点更新到当前节点
            pre = cur;
            //当前节点到next节点
            cur = next;
        }
        return null;
    }
}
