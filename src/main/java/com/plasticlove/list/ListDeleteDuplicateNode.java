package com.plasticlove.list;

/**
 * @author luka-seu
 * @description 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * @create 2019/4/3-18:22
 */
public class ListDeleteDuplicateNode {
    public Node deleteDuplication(Node pHead)
    {
        Node first = new Node(-1);

        Node head = pHead;
        first.next = pHead;
        Node last = first;
        while(head!=null&&head.next!=null){
            if(head.data==head.next.data){
                int val = head.data;
                while(head!=null&&head.data == val){
                    head = head.next;
                }
                last.next = head;
            }else{
                last = head;
                head = head.next;
            }


        }
        return first.next;
    }
}
