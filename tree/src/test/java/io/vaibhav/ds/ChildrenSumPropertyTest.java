package io.vaibhav.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChildrenSumPropertyTest {

   private ChildrenSumProperty childrenSumProperty;

   public ChildrenSumPropertyTest() {
       this.childrenSumProperty =  new ChildrenSumProperty();

   }

    @Test
    void isChildrenSum() {
        /**
         *           20
         *          /  \
         *         8   12
         *            /  \
         *           9    3
         */
       Node<Integer> tree = new Node<>(20);
       tree.left =  new Node(8);
       tree.right =  new Node(12);
       tree.right.left =  new Node(9);
       tree.right.right =  new Node(3);

       boolean isChildrenSum = childrenSumProperty.isChildrenSum(tree);

       assertTrue(isChildrenSum);

    }

    @Test
    void isChildrenSumNegative() {

        /**
         *           20
         *          /  \
         *         8   12
         *            /  \
         *           9    2
         */
        Node<Integer> tree = new Node<>(20);
        tree.left =  new Node(8);
        tree.right =  new Node(12);
        tree.right.left =  new Node(9);
        tree.right.right =  new Node(2);

        boolean isChildrenSum = childrenSumProperty.isChildrenSum(tree);

        assertFalse(isChildrenSum);

    }
}