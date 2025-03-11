package BinaryTree;

public class flatternTree {
	
	public void flatten(TreeNode root) {
        if (root == null) return;

         flatten(root.left);
         flatten(root.right);
         TreeNode tempright = root.right;
         root.right =root.left;
         root.left = null;

         TreeNode current = root;
         while (current.right != null)
         {
            current= current.right;
         }
         current.right = tempright;
    }
}
