package com.plasticlove.list;

public class MyList {

    Node head = null;

    /**
     *
     */
    public boolean addNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;

            return true;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = node;
        return true;
    }

    /**
     * @return
     */
    public int length() {
        int length = 0;
        Node tempNode = head;
        while (tempNode != null) {
            tempNode = tempNode.next;
            length++;
        }

        return length;
    }

    /**
     * @param index
     * @return
     */
    public boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        //删除第一个节点
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 2;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = preNode.next;
            curNode = curNode.next;
            i++;
        }
        return true;

    }

    /**
     * 打印列表元素
     */

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }

    /**
     * 链表排序
     */
    public void sortList() {
        Node curNode = head;
        int tempData = 0;
        Node nextNode = null;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data < nextNode.data) {
                    tempData = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = tempData;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
    }

    /**
     * 删除链表重复元素
     */
    public void deleteDuplecate() {
        if (head == null) {
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            //这里nextNode不能等于curNode.next会报空指针
            Node nextNode = curNode;
            while (nextNode.next != null) {
                if (curNode.data == nextNode.next.data) {
                    nextNode.next= nextNode.next.next;

                } else {
                    nextNode = nextNode.next;
                }
            }
            curNode = curNode.next;
        }


    }


}
