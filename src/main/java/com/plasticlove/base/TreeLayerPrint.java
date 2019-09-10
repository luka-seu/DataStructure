package com.plasticlove.base;

import com.plasticlove.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author luka-seu
 * @description 树的层次遍历
 * @create 2019-09 10-21:44
 **/

public class TreeLayerPrint {

    public void treeLayerPrint(TreeNode node){
        if (node==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        //先将根节点放入队列中
        queue.add(node);
        while(!queue.isEmpty()){
            //先放左节点，再放右节点
            TreeNode temp = queue.poll();
            if (temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }
        }
    }

}
