package org.dsa.binaryTree.medium;

import org.dsa.binaryTree.TreeNode;

public class _1_DepthBinaryTreeRecursive {
    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(depthBinaryTreeRecursive(root));
    }

    private static int depthBinaryTreeRecursive(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = depthBinaryTreeRecursive(root.left);
        int rightHeight = depthBinaryTreeRecursive(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
