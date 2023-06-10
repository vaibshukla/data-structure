package io.vaibhav.ds;

public class BinaryTreeTraversal {

    public void inorder(Node root) {

        if (root == null ) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorder(Node root) {

        if (root == null ) return;

        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public void postorder(Node root) {

        if (root == null ) return;

        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + " ");

    }
}
