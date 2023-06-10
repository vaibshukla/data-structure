package io.vaibhav.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTraversalTest {

    private BinaryTreeTraversal binaryTreeTraversal;

    public BinaryTreeTraversalTest() {
        this.binaryTreeTraversal = new BinaryTreeTraversal();
    }
    /***
     *
     *     10
     *    /  \
     *   5    4
     *  /      \
     * 2        1
     */

    @Test
    public void printInorderTraversal() {
        Node<Integer> tree = new Node<>(10);
        tree.left =  new Node(5);
        tree.left.left = new Node(2);
        tree.right =  new Node(4);
        tree.right.right =  new Node(1);
        binaryTreeTraversal.inorder(tree);
        assertTrue(true);


    }

    @Test
    public void printPreorderTraversal() {
        Node<Integer> tree = new Node<>(10);
        tree.left =  new Node(5);
        tree.left.left = new Node(2);
        tree.right =  new Node(4);
        tree.right.right =  new Node(1);
        binaryTreeTraversal.preorder(tree);
        assertTrue(true);

    }

    @Test
    public void printPostorderTraversal() {
        Node<Integer> tree = new Node<>(10);
        tree.left =  new Node(5);
        tree.left.left = new Node(2);
        tree.right =  new Node(4);
        tree.right.right =  new Node(1);
        binaryTreeTraversal.postorder(tree);
        assertTrue(true);


    }

}