package com.plasticlove.list;

import java.util.HashMap;
import java.util.Set;

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

    public static Node deleteDuplication(Node pHead)
    {
        if(pHead==null) {
            return null;
        }
        HashMap map = new HashMap();

        while(pHead.next!=null){
            int index = 0;
            Node cur = pHead;
            while(pHead.data==pHead.next.data){
                index++;
                pHead = pHead.next;
            }
            map.put(cur,index);
            pHead = pHead.next;
        }

        Node[] nodeArr1 = (Node[]) map.keySet().toArray();
        for(Node node:nodeArr1){
            if((int)map.get(node)>0){
                map.remove(node);
            }
        }
        Node[] nodeArr = (Node[]) map.keySet().toArray();
        for(int i = 0;i<nodeArr.length-1;i++){
            nodeArr[i].next = nodeArr[i+1];
        }
        return nodeArr[0];
    }
}
