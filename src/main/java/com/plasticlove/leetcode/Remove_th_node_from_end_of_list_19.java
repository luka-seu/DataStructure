package com.plasticlove.leetcode;//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
//
// 示例： 
//
// 给定一个链表: 1->2->3->4->5, 和 n = 2.
//
//当删除了倒数第二个节点后，链表变为 1->2->3->5.
// 
//
// 说明： 
//
// 给定的 n 保证是有效的。 
//
// 进阶： 
//
// 你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针


//leetcode submit region begin(Prohibit modification and deletion)

import org.junit.Test;

import java.util.ListIterator;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Remove_th_node_from_end_of_list_19 {

    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
        System.out.println(this.removeNthFromEnd(l1, 2));

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //先让一个指针先跑n-1步，后一个指针在跑，前一个指针到尾节点，后一个就是倒数第n个节点
        if (head == null || head.next == null) {
            return null;
        }
        ListNode front = head;
        ListNode rear = head;
        //处理n = 1的情况
        int frontStep = 0;
        while (front.next != null) {
            front = front.next;

            if (frontStep >= n) {
                rear = rear.next;
            }
            if (frontStep < n) {
                frontStep++;
            }
        }
        //FIXME  当front<n的时候说明front指针已经走到了尾，但是rear还没有动过，说明要删除的是头节点
        if (frontStep < n) {
            return head.next;
        }
        //这是rear就是要删除的节点
        rear.next = rear.next.next;
        return head;

    }
}

