package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.fasterxml.jackson.core.TreeNode;

public class averageLevelsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//average   divdide the node left and right /2 and then add those node of left and right

	 public List<List<Integer>> levelOrder(TreeNode root) {
		
	
	
	List<List<Double>> result = new ArrayList<>();
	if (root == null)
	{
		return result;
	}
	
	Queue <TreeNode > queue = new LinkedList<>();
	queue.offer(root);
	while (!queue.isEmpty())
	{
		int levelsize = queue.size();
		//List<Integer> currentLevel = new ArrayList<>(levelsize);
		double averageLevel = 0 ;
		for (int i = 0 ; i< levelsize ; i++)
		{
			TreeNode currentNode = queue.poll();
			averageLevel += currentNode.val;
			if(currentNode.left != null)
			{
				queue.offer(currentNode.left);//add element , return false if full queue
			}
			if(currentNode.right!=null)
			{
				queue.offer	(currentNode.right);
			}
			
		}
		averageLevel =averageLevel/levelsize;
		result.add(currentLevel);
	}
				
		
		return result;
	 }
}
