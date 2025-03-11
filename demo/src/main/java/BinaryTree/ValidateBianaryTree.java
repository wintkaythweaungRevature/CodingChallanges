package BinaryTree;

import com.fasterxml.jackson.core.TreeNode;

public class ValidateBianaryTree {
	
	
	public boolean isValidBST(TreeNode root)
	{
		return helper (root,null,null);
	}
	public boolean helper(TreeNode node,Integer low ,Integer high) {
		if (node == null)
		{return true;}
		
		if(low != null && node.val <=low )
		{
			return false ;
		}
		if(high != null &&node.val >= high)
		{
			return false;
		}
		boolean leftTree = helper(node.left ,low);
		boolean righTree = helper (node.right ,high);
		
		return leftTree && rightTree;
	}
}
