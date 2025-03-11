package BinaryTree;

public class SumroottoLeafno {

	
	public int sumNumbers(TreeNode root)
	{
		return helper (root ,  0 );
	}
	
	public int helper (TreeNode root , int sum)
	{
		if (root == null)
		{
			return 0 ;
			
		}
		if(root.left ==null && root.right == null)
		{
			return sum;
		}
		return helper(root.left,sum)+ helper (root.right, sum);
	}
}
