package com.plasticlove.list;

import org.junit.Test;

import java.util.Stack;

/**
 * @author luka-seu
 * @description 判断是否是回文链表
 * @create 2019/9/4-15:25
 */
public class PalindromeList {
    @Test
    public void test(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(this.palindromeList2(n1));
    }

    /**
     * 方案1：利用栈-全压栈
     */
    public boolean palindromeList(Node node){
        Stack<Node> stack = new Stack<>();
        Node head = node;
        while(node!=null){
            stack.push(node);
            node = node.next;
        }
        while(!stack.isEmpty()){
            if (head.data!=stack.pop().data){
                return false;
            }
            head = head.next;
        }
        return true;
    }

    /**
     * 方案2：利用栈-压一半-不建议
     */


    /**
     * 方案3：反转后半部分链表再比较
     */
    public boolean palindromeList2(Node node){
        Node slow = node;
        Node fast = node;
        while(fast.next != null&&fast.next.next!=null){
            //让slow指针指向中间,fast指针指向最后一个节点
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow指针所在节点的next指向null
        Node midNext = slow.next;
        slow.next=null;
        //后半部分反转之后的头节点
        Node pre = slow;

        //后半部分反转后的头节点
        //中间节点的下一个节点
        Node cur = midNext;
        while(cur!=null){
            //反转单链表要记住next节点和上一个节点
            Node curNext = cur.next;
            //当前节点指向上一个节点
            cur.next = pre;
            //上一个节点移到当前节点
            pre = cur;
            //当前节点移到记住的下一个节点
            cur = curNext;
        }
        while(node!=slow&&pre!=slow){
            if (node.data!=pre.data){
                return false;
            }
            node=node.next;
            pre = pre.next;
        }
        //TODO 需要将原先的链表结构恢复--这里先不支持

        return true;
    }

}
