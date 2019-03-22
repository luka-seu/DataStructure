package com.plasticlove.list;

/**
 * @author luka-seu
 * @description 链表相关算法
 * @create 2019/3/22-16:47
 */
public class ListUtils {

    //反转单链表
    public static Node reverseList(Node head){
        Node pNode = head;
        Node pPrev = null;
        Node pReverseHead = null;
        while (pNode!=null){
            Node pNext = pNode.next;//保存反转链表next指针之前的后一个节点
            if(pNode.next==null){
                pReverseHead = pNode;//当next指针为null时，为原先链表的尾节点，也就是反转后的头节点
            }
            pNode.next=pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return pReverseHead;
    }
}
