package com.plasticlove.list;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author luka-seu
 * @description 合并两个有序单链表，且合并后的链表的依然有序
 * @create 2019/9/4-14:43
 */
public class MergeTwoSortedList {
    @Test
    public void test(){
        Node n1 = new Node(3);
        Node n2 = new Node(12);
        Node n3 = new Node(23);
        Node n4 = new Node(35);
        Node n5 = new Node(56);
        Node n6 = new Node(100);
        Node n7 = new Node(691);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        Node p1 = new Node(7);
        Node p2 = new Node(24);
        Node p3 = new Node(34);
        Node p4 = new Node(45);
        Node p5 = new Node(59);
        Node p6 = new Node(103);
        Node p7 = new Node(871);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;

        Node node =  this.mergeSortedList2(n1,p1);
        System.out.println(node);

    }


    /**
     * 第一种方案:归并排序的外排过程：merge过程
     */
    public Node mergeSortedList1(Node node1,Node node2){
        //两个链表都空，直接返回
        if (node1==null&&node2==null){
            return null;
        }
        if (node1==null){
            return node2;
        }
        if (node2==null){
            return node1;
        }
        ArrayList<Node> finalNodeList = new ArrayList<>();
        while(node1!=null&&node2!=null){
            if (node1.data<node2.data){
                finalNodeList.add(node1);
                node1 = node1.next;
            }else {
                finalNodeList.add(node2);
                node2 = node2.next;
            }
        }
        //list1还没加进去完
        while(node1!=null){
            finalNodeList.add(node1);
            node1 = node1.next;
        }
        //list2还没加进去完
        while(node2!=null){
            finalNodeList.add(node2);
            node2 = node2.next;
        }
        //合并后的首节点
        Node first = finalNodeList.get(0);
        Node cur = first;
        for (int k = 1;k<finalNodeList.size();k++){
            cur.next = finalNodeList.get(k);
            cur = finalNodeList.get(k);
            if (k==finalNodeList.size()-1){
                cur.next = null;
            }
        }
        return first;

    }

    /**
     * 第二种方案：递归
     */
    public Node mergeSortedList2(Node n1,Node n2){
        //递归结束条件
        if (n1==null){
            return n2;
        }
        if (n2==null){
            return n1;
        }
        if (n1.data<=n2.data){
            //FIXME 将结果放在n1之后
            n1.next = mergeSortedList2(n1.next,n2);
            //将需要拿出的return
            return n1;
        } else {
            //FIXME 将结果放在n1之后
            n2.next = mergeSortedList2(n1,n2.next);
            return n2;
        }

    }
}
