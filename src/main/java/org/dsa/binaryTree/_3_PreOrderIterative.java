package org.dsa.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _3_PreOrderIterative {
    void main() {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right = new TreeNode(3);
        var ans = preOrderIterative(tree);
        for (int l : ans) {
            System.out.println(l);
        }
    }

    private static List<Integer> preOrderIterative(TreeNode tree) {
        List<Integer> preOrder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(tree);
        while (!stack.isEmpty()) {
            tree = stack.pop();
            preOrder.add(tree.data);
            if (tree.right != null) {
                stack.add(tree.right);
            }
            if (tree.left != null) {
                stack.add(tree.left);
            }
        }
        return preOrder;
    }
}

