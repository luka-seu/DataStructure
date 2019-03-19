package com.com.plasticlove.test;

import com.plasticlove.tree.BinaryTreeUtils;
import com.plasticlove.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeUtilsTest {

    @Test
    public void reconstructTreeTest() {
        int[] arr1 = {1,2,4,7,3,5,6,8};
        int[] arr2 = {4,7,2,1,5,3,8,6};
        TreeNode tree = BinaryTreeUtils.reconstructTree(arr1, 0, arr1.length - 1, arr2, 0, arr2.length - 1);
        System.out.println(tree);
    }
}