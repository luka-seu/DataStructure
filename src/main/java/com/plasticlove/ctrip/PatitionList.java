package com.plasticlove.ctrip;

/**
 * @author luka-seu
 * @description 链表排序:给定一个数m，大于m的在右边。小于m的在左边。保证次序不变
 * @create 2019/9/4-19:22
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PatitionList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
        ArrayList<ListNode> smallList = new ArrayList<>();
        ArrayList<ListNode> bigList = new ArrayList<>();
        ArrayList<ListNode> finalList = new ArrayList<>();
        while(head!=null){
            if (head.val<=m){
                smallList.add(head);
            }else{
                bigList.add(head);
            }
            head = head.next;
        }
        finalList.addAll(smallList);
        finalList.addAll(bigList);
        ListNode first = finalList.get(0);
        ListNode cur = first;
        for (int k = 1;k<finalList.size();k++){
            ListNode node = finalList.get(k);
            cur.next=node;
            cur = node;
            if (k==finalList.size()-1){
                cur.next = null;
            }
        }
        return first;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNextInt()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}

