/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public static int maxHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        else if (root.left == null){
            return 1 + maxHeight(root.right);
        }
        else if (root.right == null){
            return 1 + maxHeight(root.left);
        }
        return Math.max(1+maxHeight(root.left), 1+maxHeight(root.right));
    }
    
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        if(Math.abs(maxHeight(root.left) - maxHeight(root.right)) <= 1){
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }
}
