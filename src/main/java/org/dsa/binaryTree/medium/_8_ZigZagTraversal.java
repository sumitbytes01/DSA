package org.dsa.binaryTree.medium;

import org.dsa.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _8_ZigZagTraversal {
    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(zigzagLevelOrder(root));
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzag = new ArrayList();
        if(root == null)
            return zigzag;
        Deque<TreeNode> queue = new LinkedList();
        queue.offer(root);
        Boolean flag = false;
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList();
            int size = queue.size();
            for(int i = 0; i<size; i++){
                if(!flag) {
                    TreeNode node = queue.pollFirst();
                    list.add(node.data);
                    leftToRight(node, queue);
                }
                else {
                    TreeNode node = queue.pollLast();
                    list.add(node.data);
                    rightToLeft(node, queue);
                }
            }
            flag = !flag;
            zigzag.add(list);
        }
        return zigzag;
    }
    public static void leftToRight(TreeNode node, Deque<TreeNode> queue){
        if(node.left != null)
            queue.offerLast(node.left);
        if(node.right != null)
            queue.offerLast(node.right);
    }
    public static void rightToLeft(TreeNode node, Deque<TreeNode> queue){
        if(node.right != null)
            queue.offerFirst(node.right);
        if(node.left != null)
            queue.offerFirst(node.left);
    }
}
