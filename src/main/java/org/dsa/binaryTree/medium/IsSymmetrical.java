package org.dsa.binaryTree.medium;

import com.sun.source.tree.Tree;
import org.dsa.binaryTree.TreeNode;

public class IsSymmetrical {
    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetrical(root.left, root.right));
    }

    private static boolean isSymmetrical(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        return ((root1.data == root2.data)
                && isSymmetrical(root1.left, root2.right)
                && isSymmetrical(root1.right, root2.left));
    }
}
