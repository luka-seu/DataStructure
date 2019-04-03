package com.plasticlove.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author luka-seu
 * @description 树的层序遍历
 * @create 2019/4/3-17:47
 */
public class TreeLayerPrint {

    //层序遍历二叉树（队列）
    public static void layerPrint(TreeNode root){
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        ((LinkedList<TreeNode>) treeNodeQueue).add(root);
        while(treeNodeQueue.size()>0){
            TreeNode node = ((LinkedList<TreeNode>) treeNodeQueue).getFirst();
            ((LinkedList<TreeNode>) treeNodeQueue).pop();
            System.out.println(node);
            if (node.left!=null){
                ((LinkedList<TreeNode>) treeNodeQueue).add(node.left);
            }

            if (node.right!=null){
                ((LinkedList<TreeNode>) treeNodeQueue).add(node.right);
            }
        }
    }
}
