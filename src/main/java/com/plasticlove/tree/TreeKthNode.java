package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 找出第k大个节点
 * @create 2019/4/3-17:50
 */
public class TreeKthNode {

    //找出二叉树中的第k大的节点

    public static TreeNode getKthNode(TreeNode root,int k){
        if (root==null||k==0){
            return null;
        }
        TreeNode target = null;
        if (root.left!=null){
            target = getKthNode(root.left,k);
        }
        if (target==null){
            if (k==1){
                target=root;
            }
            k--;
        }
        if (target==null&&root.right!=null){
            target = getKthNode(root.right,k);
        }
        return target;
    }
}
