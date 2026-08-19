package org.dsa.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class _1_PreInPostIterative {
    void main() {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right = new TreeNode(3);
        List<Integer> list = new ArrayList<>();
        preOrder(tree, list);
        for (int l : list) {
            System.out.print(l+ " ");
        }
        System.out.println();
        list.clear();
        inOrder(tree, list);
        for (int l : list) {
            System.out.print(l+ " ");
        }
        System.out.println();
        list.clear();
        postOrder(tree, list);
        for (int l : list) {
            System.out.print(l+ " ");
        }
    }

    private void postOrder(TreeNode tree, List<Integer> list) {
        if(tree == null)
            return;
        postOrder(tree.left, list);
        postOrder(tree.right, list);
        list.add(tree.data);
    }

    private void inOrder(TreeNode tree, List<Integer> list) {
        if(tree == null)
            return;
        inOrder(tree.left, list);
        list.add(tree.data);
        inOrder(tree.right, list);
    }

    private void preOrder(TreeNode tree, List<Integer> list) {
        if(tree == null)
            return;
        list.add(tree.data);
        preOrder(tree.left, list);
        preOrder(tree.right, list);
    }
}
