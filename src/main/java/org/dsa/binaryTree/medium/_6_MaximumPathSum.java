package org.dsa.binaryTree.medium;

import org.dsa.binaryTree.TreeNode;

public class _6_MaximumPathSum {
    static int max_path_sum;

    static void main() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maximumPathSum(root));
    }

    private static int maximumPathSum(TreeNode root) {
        max_path_sum = Integer.MIN_VALUE;
        dfs(root);
        return max_path_sum;
    }

    private static int dfs(TreeNode root) {
        if(root == null)
            return 0;
        int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));
        max_path_sum = Math.max(max_path_sum, left + right + root.data);
        return Math.max(left, right) + root.data;
    }
}
