package org.dsa.binaryTree.medium;

import org.dsa.binaryTree.TreeNode;

public class _7_IdenticalTrees {
    static void main() {
        // traversal  of any type on both tree should give same result

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);
        System.out.println(isIdentical(root1, root2));
    }

    private static boolean isIdentical(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        }
        return ((root1.data == root2.data)
                && isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right));
    }
}
