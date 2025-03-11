package BinaryTree;

public class ConvertSortedArrayBST {

	
	
	
	 public TreeNode sortedArrayToBST(int[] nums) {
	        if (nums == null) 
	        {
	            return null;

	        }
	         return buildBSTSearch(nums, 0, nums.length - 1);
	    }
	    public TreeNode buildBSTSearch(int []nums, int start ,int end )
	    {
	         if (start > end) {
	            return null; // Base case
	        }

	        int mid = start + (end - start) / 2; // Calculate mid-point
	        TreeNode root = new TreeNode(nums[mid]); // Create root with middle element
	        root.left = buildBSTSearch(nums, start, mid - 1); // Recursively build left subtree
	        root.right = buildBSTSearch(nums,mid + 1 , end ); // Recursively build right subtree
	        return root;
	        }}
}
