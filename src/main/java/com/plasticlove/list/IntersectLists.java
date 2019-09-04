package com.plasticlove.list;

import org.junit.Test;

/**
 * @author luka-seu
 * @description 判断两个链表是否相交，相交的话找到第一个相交的节点。链表可能有环，也可能无环
 * @create 2019/9/4-16:01
 *
 *
 *
 * 先搞定两个无环链表的相交问题
 *      两个无环链表相交意味着有相同的尾指针，否则不会相交
 *      两种方法：1. hash表存节点，然后比较
 *                 2. 从尾指针向前遍历
 *  带环的链表相交有三种拓扑结构：
 *      1. 两个独立的环---不相交
 *      2. 一个共同的环在尾部----退化成无环链表相交问题
 *      3. 中间共同的环---较复杂
 *      4. 一个有环，一个无环----不可能相交
 *
 *  总思路：先判断是否有环---->无环链表相交/有环链表相交
 */
public class IntersectLists {
    @Test
    public void test(){
        Node n1 = new Node(3);
        Node n2 = new Node(12);
        Node n3 = new Node(23);
        Node n4 = new Node(35);
        Node n5 = new Node(56);
        Node n6 = new Node(100);
        Node n7 = new Node(691);
        Node n8 = new Node(41);
        Node n9 = new Node(61);
        Node n10 = new Node(71);
        Node n11 = new Node(31);
        n1.next = n6;
        n2.next = n3;
        n3.next = n4;
        n4.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;
        System.out.println(this.getNoLoopIntersectLists(n1,n2).data);
    }

    /**
     * 两个链表相交问题主函数
     * @param node1
     * @param node2
     * @return
     */

   public Node intersectLists(Node node1,Node node2){
        if (node1==null||node2==null){
            return null;
        }
       Node loop1 = this.isLoopList(node1);
       Node loop2 = this.isLoopList(node2);
        //无环
        if (loop1==null&&loop2==null){
            return getNoLoopIntersectLists(node1,node2);
        }
       //有环
       if (loop1!=null&&loop2!=null){
           return getLoopIntersectLists(node1,node2,loop1,loop2);
       }
       return null;


   }

    /**
     * 有环链表相交问题---感觉没法测
     * @param node1
     * @param node2
     * @param loop1
     * @param loop2
     * @return
     */
    private Node getLoopIntersectLists(Node node1, Node node2, Node loop1, Node loop2) {
        Node cur1 = node1;
        Node cur2 = node2;
        //和无环链表相同，只是尾指针变为环的入口
        if (loop1==loop2){

            int count1 = 0;
            while(cur1!=loop1){
                count1++;
                cur1 = cur1.next;
            }
            while(cur2!=loop1){
                count1--;
                cur2 = cur2.next;
            }
            //尾指针不同，不相交
            if (cur1!=cur2){
                return null;
            }
            //保证cur1指向长链表
            cur1 = count1>0?node1:node2;
            cur2 = cur1==node1?node2:node1;
            count1 = Math.abs(count1);
            while(count1>0){
                cur1=cur1.next;
                count1--;
            }
            while(cur1!=cur2){
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur2;
            //loop1不停的转，能遇到loop2则说明相交，否则不相交
        }else{
            cur1 = loop1.next;
            while(cur1!=loop1){
                if (cur1==loop2){
                    return loop1;
                }
                cur1=loop1.next;
            }
            return null;
        }

    }

    /**
     * 无环链表相交问题
     * @param node1
     * @param node2
     * @return
     */
    private Node getNoLoopIntersectLists(Node node1, Node node2) {
        Node cur1 = node1;
        Node cur2 = node2;
        int count1 = 0;
        while(cur1!=null){
            count1++;
            cur1 = cur1.next;
        }
        while(cur2!=null){
            count1--;
            cur2 = cur2.next;
        }
        //尾指针不同，不相交
        if (cur1!=cur2){
            return null;
        }
        //保证cur1指向长链表
        cur1 = count1>0?node1:node2;
        cur2 = cur1==node1?node2:node1;
        count1 = Math.abs(count1);
        while(count1>0){
            cur1=cur1.next;
            count1--;
        }
        while(cur1!=cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur2;



    }


    /**
     * 判断单链表是否有环,有环返回入环节点，否则返回null
     *
     */
    private Node isLoopList(Node node){
        //快慢指针；最后必然相较于同一节点
        Node slow = node.next;
        Node fast = node.next.next;
        while (slow!=fast){
            slow = slow.next;
            fast = fast.next.next;
            //有一个指针指向null，说明无环
            if (fast==null||slow==null){
                return null;
            }
        }
        //当slow和fast到同一点后，将其中一个指向头节点，之后一起向下遍历。相遇的节点就是入环节点
        fast = node;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

    }
}
