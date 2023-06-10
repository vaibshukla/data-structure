package io.vaibhav.ds;

public class BinaryTreeUtil {

    public static int height(Node root) {
        if (root == null ) return 0;
        return Math.max(height(root.left) , height(root.right)) + 1;
    }

    // Number of node in binary tree
    public static int degree( Node root) {
        if (root == null) return 0;

        return 1 + degree(root.left) + degree(root.right);

    }

}
