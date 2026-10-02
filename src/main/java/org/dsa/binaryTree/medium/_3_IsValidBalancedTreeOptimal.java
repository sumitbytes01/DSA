package org.dsa.binaryTree.medium;

import org.dsa.binaryTree.TreeNode;

public class _3_IsValidBalancedTreeOptimal {
    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(dfsHeight(root) != -1);
    }

    private static int dfsHeight(TreeNode root) {
        // return i1 if not a balance binary tree
        if(root == null)
            return 0;
        int leftHeight = dfsHeight(root.left);
        if(leftHeight == -1)
            return -1;
        int rightHeight = dfsHeight(root.right);
        if(rightHeight == -1)
            return -1;
        if(Math.abs(leftHeight - rightHeight) >1) // condition to check if left and right evaluation leads to binary tree or not
            return -1;
        return Math.max(leftHeight, rightHeight) +1;// fn computing the height//depth
    }
}
