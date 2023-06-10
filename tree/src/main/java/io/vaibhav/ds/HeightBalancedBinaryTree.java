package io.vaibhav.ds;

/***
 *  A tree is called height balanced if the difference between it's height of left subtree
 *  and right subtree is not more than 1
 *
 *     TODO : Give some example
 *
 */
public class HeightBalancedBinaryTree {

    /***
     *  This will check in T O(n^2).
     *  Algo
     *  For any given node
     *      1. Find the height of left subtree.
     *      2. Find the height of right subtree.
     *      3. Check it's difference should be less then equal to 1 ,then recursively call the left and right subtree
     * @param root
     * @return
     */
    public boolean isHeightBalancedNaive(Node root ) {

        if (root == null)  return true;

        int lh = BinaryTreeUtil.height(root.left);
        int rh = BinaryTreeUtil.height(root.right);

        return (Math.abs(lh - rh) <=1 ) && isHeightBalancedNaive(root.left) && isHeightBalancedNaive(root.right);
    }

    /****
     *  Return the integer value , which represent height in case tree is balanced and return
     *  -1 if tree is not balanced
     *
     *  Algo
     *   For a given node
     *   1. Check if it's left subtree is balanced
     *   2. Check if it's right subtree is balanced
     *   3. There height difference should not be more than 1
     *
     * @param root
     * @return
     */
    public int isHeightBalanced(Node root) {

        // Every leaf node is balanced ,so there height will be 1
        if (root == null) return 0;

        int lh = isHeightBalanced(root.left);
        if (lh == -1) return -1;

        int rh =  isHeightBalanced(root.right);
        if (rh == -1 ) return -1;

        return Math.abs(lh-rh) > 1  ? -1 : Math.max(lh,rh) +1;
    }
}
