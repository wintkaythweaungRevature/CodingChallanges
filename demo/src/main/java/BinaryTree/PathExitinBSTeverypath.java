package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.w3c.dom.Node;

public enum PathExitinBSTeverypath {
////https://leetcode.com/problems/path-sum-iii/
	 public int pathSum(TreeNode root, int sum) {
	        

		 List<Integer> path = new LinkedList<>();
		 		return helper(root,sum, path);


		     }



		 	
		 	int helper (TreeNode root ,int sum ,List<Integer> path)
		 	{
		 		if (root == null)
		 		{return 0;}
		 		path.add(root.val);
		 		int count = 0 ;
		 		int s = 0 ;
		 		// how many path can i make
		 		ListIterator<Integer>Itr = path.listIterator (path.size());
		 		while (Itr.hasPrevious())
		 		{
		 			s += Itr.previous();
		 			
		 			if(s == sum )
		 			{
		 				count ++;
		 			}
		 		}
		 		count += helper(root.left, sum,path)+helper(root.right ,sum ,path);
		 		
		 		//backtracking
		 		path.remove(path.size()-1);
		 		return count;
		 	}
		 	
		 	
		 	
		 	
/// put in the list    https://leetcode.com/problems/path-sum-ii/



		    public List<List<Integer>> pathSum(TreeNode node, int sum) {
		     List<List<Integer>> paths = new ArrayList<>();
		        List<Integer> path = new ArrayList<>();
		        helper(node, sum, path, paths); // Correctly passing `paths`
		        return paths;
		    }

		    void helper(TreeNode node, int sum, List<Integer> path, List<List<Integer>> paths) {
		        if (node == null) {
		            return; // Base case
		        }

		        // Add current node value to the path
		        path.add(node.val);

		        // If it's a leaf node and sum matches
		        if (node.val == sum && node.left == null && node.right == null) {
		            paths.add(new ArrayList<>(path)); // Add current path to result
		        } else {
		            // Recursively call for left and right subtrees with updated sum
		            helper(node.left, sum - node.val, path, paths);
		            helper(node.right, sum - node.val, path, paths);
		        }

		        // Backtrack: remove the current node from the path
		        path.remove(path.size() - 1);
		    }
		    
		}
