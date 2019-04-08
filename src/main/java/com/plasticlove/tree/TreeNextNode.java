package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * @create 2019/4/8-17:13
 */
public class TreeNextNode {

    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        //如果右子树不为空，则下一个节点位于右子树的左节点
        if (pNode.right!=null){
            pNode = pNode.right;
            while(pNode.left!=null){
                pNode = pNode.left;
            }
            return pNode;
        }
        //如果右子树为空，则寻找其父节点，若此节点是父节点的左节点，则直接返回父节点，反之一致遍历到根节点。
        while(pNode.next!=null){
            TreeLinkNode pRoot = pNode.next;
            if (pRoot.left==pNode){
                return pRoot;
            }
            pNode = pNode.next;
        }
        return null;

        //左叶子节点

    }
}
