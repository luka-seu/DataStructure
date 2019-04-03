package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @create 2019/4/3-18:14
 */
public class TreeConvertList {
    private TreeNode head = null;
    private TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        midSearch(pRootOfTree);
        return pre;
    }

    private void midSearch(TreeNode pRootOfTree){
        if(pRootOfTree==null) return;
        midSearch(pRootOfTree.left);
        if(head==null){
            head = pRootOfTree;
            pre = pRootOfTree;
        }else{
            head.right=pRootOfTree;
            pRootOfTree.left = head;
            head = pRootOfTree;
        }
        midSearch(pRootOfTree.right);

    }
}
