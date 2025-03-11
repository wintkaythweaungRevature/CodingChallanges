package BinaryTree;

import java.util.Deque;

import com.fasterxml.jackson.core.TreeNode;

public class zitzaplevelorderTravesal {private static final String List = null;
TreeNode root)
{
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        List<List<Integer> > result = new ArrayList<>();
			if (root == null) {
				return result;
			}
			
			
			Deque<TreeNode> queue = new LinkedList<>();
			queue.add(root);
			boolean reverse = false;
			
			while (!queue.isEmpty())
			{
				int levelsize = queue.size();
				List<Integer> currentLevel = new ArrayList<>();
				for (int i = 0 ; i< levelsize; i++)
				{
					if(!reverse)// if it normal just do it normal
					{
						TreeNode currentNode = queue.pollFirst();// remeove from first 
						currentLevel.add( currentNode.val);
						if(currentNode.left !=null)
							{queue.addLast(currentNode.left);// add in front
							}
						if(currentNode.right!= null)
						{
							queue.addLast(currentNode.right);
						}
					}
					else
					{
	                    TreeNode currentNode = queue.pollLast();// remeove from last 
					    currentLevel .add( currentNode.val);
					        if(currentNode.right!= null)
					            {
						        queue.addFirst(currentNode.right);
					            } if(currentNode.left !=null)
						        {queue.addFirst(currentNode.left);// add in front
						        }
					       
						
					}
				
				}
				
				reverse = !reverse ;
				result .add(currentLevel);
			}
			
			return result;
			
	    }
	
	
	

}
