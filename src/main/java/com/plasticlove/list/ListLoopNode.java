package com.plasticlove.list;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @author luka-seu
 * @description 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @create 2019/4/8-16:53
 */
public class ListLoopNode {
    /**
     *
     * //先说个定理：两个指针一个fast、一个slow同时从一个链表的头部出发
     * //fast一次走2步，slow一次走一步，如果该链表有环，两个指针必然在环内相遇
     * //此时只需要把其中的一个指针重新指向链表头部，另一个不变（还在环内），
     * //这次两个指针一次走一步，相遇的地方就是入口节点。
     * @param pHead
     * @return
     */
    public Node EntryNodeOfLoop(Node pHead) {
        if (pHead==null){
            return null;
        }
        Node slow = pHead;
        Node fast = pHead;
        boolean flag = false;
        while(slow.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
               fast = pHead;
               while (fast!=slow){
                   fast = fast.next;
                   slow = slow.next;
               }
               if (fast==slow){
                   return fast;
               }
            }
        }
        return null;


    }
}
