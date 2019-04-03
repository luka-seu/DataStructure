package com.plasticlove.list;

/**
 * @author luka-seu
 * @description 输入一个链表，反转链表后，输出新链表的表头
 * @create 2019/4/3-18:06
 */
public class ListReverse {
    public Node ReverseList(Node head) {
        if(head==null){
            return null;
        }
        Node pre = null;
        Node cur = head;
        Node newHead = null;
        while(cur!=null){
            Node nextNode = cur.next;
            if(cur.next==null){
                newHead  = cur;;
            }
            cur.next = pre;
            pre = cur;
            cur = nextNode;

        }
        return newHead;
    }
}
