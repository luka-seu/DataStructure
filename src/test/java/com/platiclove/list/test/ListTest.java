package com.platiclove.list.test;

import com.plasticlove.list.MyList;
import com.plasticlove.list.Node;
import org.junit.Test;


public class ListTest {
    private MyList mylist = new MyList();
    private MyList mylist1 = new MyList();
    @Test
    public void testNode(){

        Node node1 = new Node(4);
        Node node2 = new Node(4);
        Node node3 = new Node(5);
        Node node4 = new Node(6);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        Node node7 = new Node(8);
        Node node8 = new Node(3);
        Node node9 = new Node(2);
        Node node10 = new Node(10);
        Node node11 = new Node(21);
        Node node12 = new Node(33);
        mylist.addNode(node1);
        mylist.addNode(node2);
        mylist.addNode(node3);
        mylist.addNode(node4);
        mylist.addNode(node5);
        mylist.addNode(node6);


        mylist1.addNode(node8);
        mylist1.addNode(node9);
        mylist1.addNode(node10);
        mylist1.addNode(node5);

        /*mylist1.addNode(node6);*/

        /*mylist.addNode(4);
        mylist.addNode(4);
        mylist.addNode(5);
        mylist.addNode(6);
        mylist.addNode(6);
        mylist.addNode(7);*/
        //System.out.println(mylist.length());
        //mylist.deleteNode(3);
        //System.out.println(mylist.length());
        mylist.printList();
        //mylist.deleteDuplecate();

        System.out.println("--------------------------");

        //int i = mylist.findReverseElement(4);
        //System.out.println(i);
        //mylist.reverseList();
        System.out.println("--------------------------");
        mylist.printList();
        System.out.println("--------------------------");
        mylist.reversePrint(mylist.getHead());
        System.out.println("--------------------------");
        Node midNode = mylist.searchMidNode();
        System.out.println(midNode.data);

        System.out.println("--------------------------");


        boolean intersect = MyList.isIntersect(mylist.getHead(), mylist1.getHead());
        System.out.println(intersect);



    }




}
