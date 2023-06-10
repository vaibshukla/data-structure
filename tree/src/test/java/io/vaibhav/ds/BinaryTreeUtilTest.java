package io.vaibhav.ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeUtilTest {
    Node<Integer> tree ;

    @BeforeEach
    public void setup() {
        /**
         *  I/P
         *           20
         *          /  \
         *         8   12
         *            /  \
         *           9    3
         *
         *   O/P - 3
         */
        tree = new Node<>(20);
        tree.left =  new Node(8);
        tree.right =  new Node(12);
        tree.right.left =  new Node(9);
        tree.right.right =  new Node(3);


    }
    @Test
    void height() {
        int actual = BinaryTreeUtil.height(tree);
        assertEquals(3, actual);

    }

    @Test
    void degree() {
        int degree = BinaryTreeUtil.degree(tree);
        assertEquals(5 , degree);

    }
}