package com.plasticlove.tree;

import java.util.ArrayList;

/**
 * @author luka-seu
 * @description 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @create 2019/4/3-18:12
 */
public class TreePrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        //借助队列实现
        ArrayList<Integer> result = new ArrayList();
        ArrayList<TreeNode> nodes = new ArrayList();
        if(root==null){
            return result;
        }
        nodes.add(root);
        while(nodes.size()!=0){
            TreeNode node = nodes.remove(0);
            if(node.left!=null){
                nodes.add(node.left);
            }
            if(node.right!=null){
                nodes.add(node.right);
            }
            result.add(node.data);
        }
        return result;

    }
}
