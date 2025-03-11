package BinaryTree;

public class SysmetricTreemirrortree {

	public boolean isSymmetric(TreeNode root)
	{
		Queue<TreeNode> quue = new LinkedList<>();
		queue.add(root.left);
		queue.add(root.right);
		
		while (!queue.isEmpty())
		{
			TreeNode<Integer> left = queue.poll();
			TreeNode<Integer> right = queue.poll();
			
			if(left==null && right== null)
			{
				continue;
			}
			if (left == null || right == null)
			{
				continue false;
			}
			
			if(left.val != right.val)
			{
				return false;
			}
			queue.add(left.left);
			queue.add(right.right);
			queue.add(left.right);
			queue.add(right.left);
			
		}
	}
}
