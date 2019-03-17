package com.plasticlove.list;


public class MyList {

    private Node head;

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    /**
     *
     */
    public boolean addNode(Node node) {

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

    /**
     * 寻找链表中倒数第reverseIndex个元素
     * @param reverseIndex
     * @return
     */
    public int findReverseElement(int reverseIndex){
        if(reverseIndex<1||reverseIndex>length()){
            return -1;
        }
        Node backNode = head;
        Node frontNode = head;
        int step = 0;
        while(step<(reverseIndex-1)){
            frontNode = frontNode.next;
            step++;
        }
        while(frontNode.next!=null){
            backNode = backNode.next;
            frontNode = frontNode.next;
        }

        return backNode.data;
    }

    /**
     * 链表的反转
     *
     */
    public void reverseList(){
        Node pReverseHead = head;
        Node pNode = head;
        Node pPrev = null;

        while(pNode!=null){
            Node pNext = pNode.next;
            if(pNext==null){
                pReverseHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        this.head = pReverseHead;
    }

    /**
     * 从后向前输出链表
     * @param pHead
     */
    public void reversePrint(Node pHead){
        if(pHead!=null){
            reversePrint(pHead.next);
            System.out.println(pHead.data);
        }
    }

    /**
     * 寻找链表中间节点
     * @return
     */
    public Node searchMidNode(){
        Node slowNode = this.head;
        Node fastNode = this.head;
        while(fastNode!=null&&fastNode.next!=null&&fastNode.next.next!=null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }

    /**
     * 判断链表是否有环
     * @return
     */
    public boolean isLoop(){
        Node slowNode = this.head;
        Node fastNode = this.head;
        if(fastNode==null){
            return false;
        }
        while(fastNode!=null&&fastNode.next!=null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(fastNode==slowNode){
                return true;
            }
        }
        return false;
    }

    /**
     * 在不知道头节点的情况下删除指定节点
     * @param node
     * @return
     */
    public boolean deleteNode(Node node){
        if(node==null||node.next==null){
            return false;
        }
        int temp  = node.data;
        node.data = node.next.data;
        node.next.data = temp;
        node.next = node.next.next;

        return true;
    }

    /**
     * 判断两个链表是否相交
     * @param h1
     * @param h2
     * @return
     */
    public static boolean isIntersect(Node h1,Node h2){
        if(h1==null||h2==null){
            return false;
        }
        Node head1 = h1;
        Node head2 = h2;
        while(head1.next!=null){
            head1 = head1.next;
        }
        while(head2.next!=null){
            head2 = head2.next;
        }

        if(head1==head2){
            return  true;
        }
        return false;
    }
































































}
