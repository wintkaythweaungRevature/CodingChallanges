package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import com.fasterxml.jackson.core.TreeNode;

public class SuccessorBinaryTree {
	
	public TreeNode findSuccessor (TreeNode root , int key)
	{
		if (root == null)
		{
			return null;
		}
		

		
		Queue <TreeNode > queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty())
		{
			int levelsize = queue.size();
			//List<Integer> currentLevel = new ArrayList<>(levelsize);
			
			
				TreeNode currentNode = queue.poll();
				
				if(currentNode.left != null)
				{
					queue.offer(currentNode.left);//add element , return false if full queue
				}
				if(currentNode.right!=null)
				{
					queue.offer(currentNode.right);
				}
				if(currentNode.val == key)
				{
					break;
					
				}
		}
					
			
			return queue.peek();
	}

}
