package io.vaibhav.ds;

public class ChildrenSumProperty {


    public boolean isChildrenSum(Node<Integer> root ) {

        if (root == null ) return true;
        // Check if it's leaf node , if it is then return true
        if (root.left == null && root.right == null ) return true;

        int sum =0 ;
        if (root.left != null) sum += (int)root.left.data;
        if (root.right != null) sum += (int)root.right.data;
        return (sum ==  root.data
                && isChildrenSum(root.left)
                && isChildrenSum(root.right)
        );
    }
}
