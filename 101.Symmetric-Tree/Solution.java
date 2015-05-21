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
    public static boolean isSymTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        if (p != null && q != null){
            if(p.val == q.val){
                return isSymTree(p.left,q.right) && isSymTree(p.right,q.left);
            }
        }
        return false;
    }
    
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        TreeNode L = root.left;
        TreeNode R = root.right;
        return isSymTree(L,R);
    }
}
