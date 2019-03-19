package com.plasticlove.tree;

public class TreeNode {
    private int data;
    private TreeNode leftTree;

    public TreeNode getRightTree() {
        return rightTree;
    }

    public void setRightTree(TreeNode rightTree) {
        this.rightTree = rightTree;
    }

    private TreeNode rightTree;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(TreeNode leftTree) {
        this.leftTree = leftTree;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftTree=" + leftTree +
                ", rightTree=" + rightTree +
                '}';
    }
}
