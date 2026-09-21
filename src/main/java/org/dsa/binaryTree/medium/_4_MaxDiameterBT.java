package org.dsa.binaryTree.medium;

import org.dsa.binaryTree.TreeNode;

public class _4_MaxDiameterBT {
    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(diameter(root));
    }

    private static int diameter(TreeNode root) {
        if (root == null)
            return 0;
        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);
        int currDiam = height(root.left) + height(root.right);
        return Math.max(leftDiam, Math.max(rightDiam, currDiam));
    }

    private static int height(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,  rightHeight)+1;
    }
}
