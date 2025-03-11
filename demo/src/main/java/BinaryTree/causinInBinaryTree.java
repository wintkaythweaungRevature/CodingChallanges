/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        
		TreeNode xx = findNode(root, x);
		TreeNode yy = findNode (root,y);
		
		return (
				(level (root,xx,0) == level(root,yy,0)) && (!isSibling (root,xx,yy))
                ); // level should be same 
				
				
	}
  TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        }
        if (node.val == x) { // Found the target node
            return node;
        }
        // Search in the left subtree
        TreeNode n = findNode(node.left, x);
        if (n != null) {
            return n;
        }
        // Search in the right subtree
        return findNode(node.right, x);
    }

    // Helper function to check if two nodes are siblings
    boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null) {
            return false;
        }
        return (
            (node.left == x && node.right == y) ||
            (node.left == y && node.right == x) ||
            isSibling(node.left, x, y) ||
            isSibling(node.right, x, y)
        );
    }

    // Helper function to find the level of a node
    int level(TreeNode node, TreeNode x, int lev) {
        if (node == null) {
            return -1; // Node not found
        }
        if (node == x) {
            return lev; // Found the target node
        }
        // Search in the left subtree
        int l = level(node.left, x, lev + 1);
        if (l != -1) { // Node found in the left subtree
            return l;
        }
        // Search in the right subtree
        return level(node.right, x, lev + 1);
    }
}