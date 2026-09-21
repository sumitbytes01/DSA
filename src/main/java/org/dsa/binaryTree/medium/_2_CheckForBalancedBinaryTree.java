package org.dsa.binaryTree.medium;

import org.dsa.binaryTree.TreeNode;

public class _2_CheckForBalancedBinaryTree {
    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(bruteSolution(root));
    }

    private static boolean bruteSolution(TreeNode root) {
        if(root == null)
            return true ;
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) <= 1
                && bruteSolution(root.left)
                && bruteSolution(root.right))
            return true;
        return false;
    }

    private static int findHeight(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
