package BinaryTree;

public class DiameterTree {

	int diameter = 0 ;
	public int diameterofBinaryTree(TreeNode root)
	{
		height (root);
		return diameter;
	}
	int height (TreeNode node )
	{
		if(node == null)
		{
			return 0 ;
		}
	}
	int leftHeight =height(node.left);
	int rightHeight = height (node.right);
	
	int dia= leftHeight + rightHeight+1;
	diameter = Math.max(diameter, dia);
	
	return Math.max(leftHeight, rightHeight)+1;
	
}
