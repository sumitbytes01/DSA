package org.dsa.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public static void main(String[] args) {

        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> list = new ArrayList<>();
        // Getting preorder traversal
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        java.util.List<Integer> result = preOrderTraversal.preOrder(root, list);

        // Displaying the preorder traversal result
        System.out.print("Preorder Traversal: ");
        // Output each value in the
        // preorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    private List<Integer> preOrder(Node root, List<Integer> list) {
        if(root == null)
            return list;
        list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
        return list;
    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}