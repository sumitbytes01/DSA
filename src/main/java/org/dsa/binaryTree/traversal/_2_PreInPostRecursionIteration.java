package org.dsa.binaryTree.traversal;

import org.dsa.binaryTree.TreeNode;

public class _2_PreInPostRecursionIteration {
    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("PreOrder");
        pre(root);
        System.out.println();
        System.out.println("InOrder");
        in(root);
        System.out.println();
        System.out.println("PostOrder");
        post(root);

    }

    private static void pre(TreeNode root) {
        if(root == null)
            return;
        System.out.print(root.data+" ");
        pre(root.left);
        pre(root.right);
    }

    private static void in(TreeNode root) {
        if(root == null)
            return;
        in(root.left);
        System.out.print(root.data+" ");
        in(root.right);
    }
    private static void post(TreeNode root) {
        if(root == null)
            return;
        post(root.left);
        post(root.right);
        System.out.print(root.data+" ");
    }
}
