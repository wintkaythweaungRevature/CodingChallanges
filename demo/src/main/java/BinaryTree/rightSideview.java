package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.fasterxml.jackson.core.TreeNode;

public class rightSideview {
//  /            1
	//     /			\
///      2				3
///     / \            /  \
///	       5 		       4
/// 
	
	

//
//Input: root = [1,2,3,null,5,null,4]
//
//Output: [1,3,4]
//
//Explanation:
//
//Example 2:
//
//Input: root = [1,2,3,4,null,null,null,5]
//
//Output: [1,3,4,5]
	 public List<Integer> rightSideView(TreeNode root) {

	        List<Integer> result = new ArrayList<>();
	        if (root== null)
	        {
	            return result;
	        }
	        Queue<TreeNode > queue = new LinkedList<>();
	        queue.offer(root);

	       
	        while (!queue.isEmpty())
	        {
	           int levelSize = queue.size();
	            for (int i = 0 ; i< levelSize ; i++)
	            {
	                TreeNode currentNode = queue.poll();
	              if( i == levelSize -1)
	              {
	                result.add(currentNode.val);
	              }
	                if(currentNode.left !=null)
	                {
	                    queue.offer(currentNode.left);
	                }
	                if(currentNode.right!= null)
	                {
	                    queue.offer(currentNode.right);
	                }
	            }
	        

	        }
	        return result;
	        
	    }
}
