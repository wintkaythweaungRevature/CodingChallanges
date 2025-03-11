package BinaryTree;

import java.util.Queue;

import javax.swing.tree.TreeNode;

public class MaxDepthofTree {
	//int height = 0 ;
	public int MaxDepth (TreeNode root)
	{
		if (root == null)
		{return null;}
	
		Queue<TreeNode>queue = new LinedList<>();
		queue.add(root);
		
		if(!queue.isEmpty())
		{
			TreeNode currentNode = queue.poll();
			if(currentNode.left !=null)
			{
				queue.add(currentNode.left);
				int height = Math.max(currentNode.left)+1;
			}
			return Math.max(currentNode.lfet)+1;
		}
	}
}
