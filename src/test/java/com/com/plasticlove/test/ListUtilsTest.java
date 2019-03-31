package com.com.plasticlove.test;

import com.plasticlove.list.ListUtils;
import com.plasticlove.list.MyList;
import com.plasticlove.list.Node;
import org.junit.Test;

/**
 * @author luka-seu
 * @description 链表测试类
 * @create 2019/3/22-16:54
 */
public class ListUtilsTest {
    private MyList mylist = new MyList();
    Node node1 = new Node(4);
    Node node2 = new Node(5);
    Node node3 = new Node(6);
    Node node4 = new Node(6);
    Node node5 = new Node(7);
    Node node6 = new Node(7);
    Node node7 = new Node(9);
    Node node8 = new Node(10);
    Node node9 = new Node(10);
    Node node10 = new Node(10);
    Node node11 = new Node(20);
    Node node12 = new Node(33);


    @Test
    public void testReverseList(){
        mylist.addNode(node1);
        mylist.addNode(node2);
        mylist.addNode(node3);
        mylist.addNode(node4);
        mylist.addNode(node5);
        mylist.addNode(node6);
        mylist.addNode(node7);
        mylist.addNode(node8);
        mylist.addNode(node9);
        mylist.addNode(node10);
        mylist.addNode(node11);
        mylist.addNode(node12);

        Node node = ListUtils.deleteDuplication(node1);
        System.out.println(node);


    }
}
