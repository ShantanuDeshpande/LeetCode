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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null){
    		return false;
    	}
    	if (root.left == null && root.right == null){
    		return sum == root.val;
    	}
        sum -= root.val;
        boolean flag1 = false;
        boolean flag2 = false;
        if(root.left != null){
        	flag1 = hasPathSum(root.left, sum);
        }
        if(root.right != null){
        	flag2 = hasPathSum(root.right, sum);
        }
        return flag1 || flag2;
    }
}
