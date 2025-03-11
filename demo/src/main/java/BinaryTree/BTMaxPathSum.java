package BinaryTree;

public class BTMaxPathSum {
	 int ans = Integer.MIN_VALUE;

	    public int maxPathSum(TreeNode root) {
	              helper(root);
	            return ans;
		    }

		 int helper(TreeNode node) {
		        if (node == null) {
		            return 0; // Base case: null node contributes 0 to the sum
		        }
		   



	         int   left = Math.max(0,helper(node.left));
	          int  right = Math.max(0,helper(node.right));
	  int pathsum= left +right +node.val;
	        
	          ans= Math.max(ans,pathsum);//current path
	          return Math.max(left, right )+ node.val;
		       
		    
		    }
}
