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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        else if (root.left == null){
            return 1 + minDepth(root.right);
        }
        else if (root.right == null){
            return 1 + minDepth(root.left);
        }
        return Math.min(1+minDepth(root.left),1+minDepth(root.right));
    }
}
