package org.dsa.binaryTree.medium;

import org.dsa.binaryTree.TreeNode;

public class _5_MaxDiameterBTOptimal {
    private static int diameter;

    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        solve(root);
        return diameter;
    }

    private static int solve(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = solve(root.left);
        int rightHeight = solve(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}