package com.plasticlove.list;

/**
 * @author luka-seu
 * @description 输入一个链表，输出该链表中倒数第k个结点。
 * @create 2019/4/3-18:05
 */
public class ListKthToTail {
    public Node FindKthToTail(Node head,int k) {
        //先走k-1步，走到头就是倒数第k个
        if(head==null){
            return null;
        }
        int i = 0;
        Node pre = head;

        while(i<k){
            if(pre==null){
                return null;
            }
            pre = pre.next;
            i++;
        }
        while(pre!=null){
            head = head.next;
            pre = pre.next;
        }
        return head;
    }
}
