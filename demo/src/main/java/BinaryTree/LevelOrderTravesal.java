package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.fasterxml.jackson.core.TreeNode;

public class LevelOrderTravesal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	 public List<List<Integer>> levelOrder(TreeNode root) {
		
	
		
	List<List<Integer>> result = new ArrayList<>();
	if (root == null)
	{
		return result;
	}
	
	Queue <TreeNode > queue = new LinkedList<>();
	queue.offer(root);
	while (!queue.isEmpty())
	{
		int levelsize = queue.size();
		List<Integer> currentLevel = new ArrayList<>(levelsize);
		
		for (int i = 0 ; i< levelsize ; i++)
		{
			TreeNode currentNode = queue.poll();
			currentLevel.add(currentNode.val);
			if(currentNode.left != null)
			{
				queue.offer(currentNode.left);//add element , return false if full queue
			}
			if(currentNode.right!=null)
			{
				queue.offer(currentNode.right);
			}
			
		}
		result.add(currentLevel);
	}
				
		
		return result;
	 }

}
