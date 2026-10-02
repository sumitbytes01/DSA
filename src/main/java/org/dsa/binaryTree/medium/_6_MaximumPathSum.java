package org.dsa.binaryTree.medium;

import org.dsa.binaryTree.TreeNode;

public class _6_MaximumPathSum {
    static int max_path_sum = Integer.MIN_VALUE;

    static void main() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        dfs(root);
        System.out.println(max_path_sum);
    }

    private static int dfs(TreeNode root) {
        if(root == null)
            return 0;
        int leftMax = Math.max(0, dfs(root.left));
        int rightMax = Math.max(0, dfs(root.right));
        max_path_sum = Math.max(max_path_sum, leftMax + rightMax + root.data);
        return Math.max(leftMax, rightMax) + root.data;
    }
}
