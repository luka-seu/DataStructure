package com.platiclove.list.test;

import com.plasticlove.list.MyList;
import org.junit.Test;


public class ListTest {
    private MyList mylist = new MyList();
    @Test
    public void testNode(){


        mylist.addNode(4);
        mylist.addNode(4);
        mylist.addNode(5);
        mylist.addNode(6);
        mylist.addNode(6);
        //System.out.println(mylist.length());
        //mylist.deleteNode(3);
        //System.out.println(mylist.length());
        mylist.printList();
        mylist.deleteDuplecate();

        System.out.println("--------------------------");
        mylist.printList();
    }




}
