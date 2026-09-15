package org.dsa.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _5_InOrderIterative {
    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(inOrderIterative(root));
    }

    private static List<Integer> inOrderIterative(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()){

            // go to leftmost
            while (current!=null){
                stack.push(current);
                current = current.left;
            }

            // process node
            current = stack.pop();
            inOrder.add(current.data);

            // move to right subtree
            current = current.right;
        }
    return inOrder;
    }
}
