package io.vaibhav.ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightBalancedBinaryTreeTest {
    Node<Integer> tree;
    private HeightBalancedBinaryTree hbbt;
    @BeforeEach
    void setUp() {
        /**
         *  I/P
         * ()         20 lh -rh
         *          /  \
         * (0)     8   12 (0)
         *            /  \
         *           9    3
         *
         *   O/P - true
         */
        tree = new Node<>(20);
        tree.left =  new Node(8);
        tree.right =  new Node(12);
        tree.right.left =  new Node(9);
        tree.right.right =  new Node(3);

        hbbt =  new HeightBalancedBinaryTree();
    }

    @Test
    void isHeightBalancedNaive() {

        boolean heightBalancedNaive = hbbt.isHeightBalancedNaive(tree);
        assertTrue(heightBalancedNaive);

    }

    @Test
    void isHeightBalanced() {

        int heightBalanced = hbbt.isHeightBalanced(tree);
        assertNotEquals(-1 , heightBalanced);

    }
}