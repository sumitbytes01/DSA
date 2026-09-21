package org.dsa.binaryTree.traversal;

import org.dsa.binaryTree.Pair;
import org.dsa.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _1_PreInPostSingleIteration {
    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        preInPost(root);
    }

    private static void preInPost(TreeNode root) {
        // If the tree is empty,
        // return empty traversals
        if (root == null) {
            return ;
        }
        List<Integer> perOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));
        while(!stack.isEmpty()){
            Pair pair = stack.pop();
            if(pair.val == 1){
                perOrder.add(pair.num.data);
                stack.push(new Pair(pair.num,2));
                if(pair.num.left != null)
                    stack.push(new Pair(pair.num.left,1));
            }
            else if(pair.val == 2){
                inOrder.add(pair.num.data);
                stack.push(new Pair(pair.num, 3));
                if(pair.num.right != null)
                    stack.push(new Pair(pair.num.right, 1));
            }
            else {
                postOrder.add(pair.num.data);
            }
        }
        System.out.println("PreOrder: "+ perOrder);
        System.out.println("PreOrder: "+ inOrder);
        System.out.println("PreOrder: "+ postOrder);
    }

}
