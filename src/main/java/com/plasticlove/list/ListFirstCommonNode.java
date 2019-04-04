package com.plasticlove.list;

import java.util.Stack;

/**
 * @author luka-seu
 * @description 找到链表的第一个节点
 * @create 2019-04 04-01:27
 **/

public class ListFirstCommonNode {
    public Node FindFirstCommonNode(Node pHead1, Node pHead2) {
        Stack<Node> node1 = new Stack<>();
        Stack<Node> node2 = new Stack<>();
        while(pHead1!=null){
            node1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while(pHead2!=null){
            node2.push(pHead2);
            pHead2 = pHead2.next;
        }

        Node commonNode = null;
        while(!node1.isEmpty()&&!node2.isEmpty()&&node1.peek()==node2.peek()){
            node1.pop();
            commonNode =  node2.pop();
        }
        return commonNode;
    }
}
