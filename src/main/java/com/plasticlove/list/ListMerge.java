package com.plasticlove.list;

/**
 * @author luka-seu
 * @description 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @create 2019/4/3-18:07
 */
public class ListMerge {
    public Node Merge(Node list1,Node list2) {
        //递归调用
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        if(list1.data<=list2.data){
            list1.next = Merge(list1.next,list2);
            return list1;
        }else{
            list2.next = Merge(list1,list2.next);
            return list2;
        }
    }
}
