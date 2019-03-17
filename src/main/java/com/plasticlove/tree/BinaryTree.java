package com.plasticlove.tree;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public BinaryTree() {
        this.root = null;
    }

    /**
     *
     * @param node
     * @return
     */
    public boolean insert(TreeNode node){
        if(root==null){
            root = node;
            return true;
        }
        TreeNode currentNode = root;
        TreeNode parent;
        while(true){
            parent = currentNode;
            if(node.data<currentNode.data){
                currentNode = currentNode.leftTree;
                if(currentNode==null){
                    parent.leftTree= node;
                    return true;
                }
            }else{
                currentNode = currentNode.rightTree;
                if(currentNode==null){
                    parent.rightTree = node;
                    return true;
                }
            }
        }


    }

    /**
     * 构建排序二叉树
     * @param nodes
     */
    public void buildBinaryTree(TreeNode[] nodes){
        for(int i = 0;i<nodes.length;i++){
            insert(nodes[i]);
        }
    }

    /**
     * 中序遍历
     * @param pRoot
     */
    public void inOrder(TreeNode pRoot){
        if(pRoot!=null){
            inOrder(pRoot.leftTree);
            System.out.println(pRoot.data+" ");
            inOrder(pRoot.rightTree);
        }
    }

    public void inOrder(){
        inOrder(this.root);
    }

    /**
     * 先序遍历
     * @param pRoot
     */
    public void preOrder(TreeNode pRoot){
        if(pRoot!=null){
            System.out.println(pRoot.data+" ");
            preOrder(pRoot.leftTree);

            preOrder(pRoot.rightTree);
        }
    }

    public void preOrder(){
        preOrder(this.root);
    }

    /**
     * 后序遍历
     * @param pRoot
     */
    public void postOrder(TreeNode pRoot){
        if(pRoot!=null){
            postOrder(pRoot.leftTree);

            postOrder(pRoot.rightTree);
            System.out.println(pRoot.data+" ");
        }
    }

    public void postOrder(){
        postOrder(this.root);
    }

    /**
     * 层序遍历
     */
    public void layerPrint(TreeNode pRoot){
        if(pRoot==null){
            return;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();

        ((LinkedList<TreeNode>) nodeQueue).add(pRoot);
        while(!nodeQueue.isEmpty()){
            TreeNode p = nodeQueue.poll();
            System.out.println(p.data);
            System.out.println(" ");
            if(p.leftTree!=null){
                ((LinkedList<TreeNode>) nodeQueue).add(p.leftTree);
            }
            if(p.rightTree!=null){
                ((LinkedList<TreeNode>) nodeQueue).add(p.rightTree);
            }
        }

    }



}
