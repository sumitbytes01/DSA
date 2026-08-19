package org.dsa.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _4_InOrderIterative {
    void main() {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right = new TreeNode(3);
        var ans = inOrderIterative(tree);
        for (int l : ans) {
            System.out.println(l);
        }
    }

    private static List<Integer> inOrderIterative(TreeNode tree) {
        List<Integer> inOrder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(true){
            if(tree != null){
                stack.push(tree);
                tree = tree.left;
            }
            else{
                if(stack.isEmpty())
                    break;
                tree = stack.pop();
                inOrder.add(tree.data);
                tree = tree.right;
            }
        }
    return inOrder;}
}
