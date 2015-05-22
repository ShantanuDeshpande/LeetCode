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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty() && queue.peek() != null){
			List<Integer> temp = new LinkedList<Integer>();
			TreeNode n = queue.remove();
			while(n != null){
				temp.add(n.val);
				if(n.left != null){
					queue.add(n.left);
				}
				if(n.right != null){
					queue.add(n.right);
				}
				n = queue.remove();
			}
			queue.add(null);
			arr.add(temp);
		}
		return arr;
    }
}
