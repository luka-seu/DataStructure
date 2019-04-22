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
    public void layerPrint(TreeNode root){
       Queue<TreeNode> queue = new LinkedList<>();

       TreeNode temp = null;
       queue.offer(root);
       while (!queue.isEmpty()){
           temp = queue.poll();
           System.out.println(temp.data);
           if (root.left!=null){
               queue.offer(root.left);
           }
           if (root.right!=null){
               queue.offer(root.right);
           }
       }
    }
}
