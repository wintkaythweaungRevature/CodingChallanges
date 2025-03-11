package BinaryTree;

public class LowestCommonAncestorBT {
public TreeNode LowerstCommentSncetorstor(TreeNode root , TreeNode p , TreeNode q)
{
 if (root == null)
 {return null;}
 
 if(root==p || root == q)
 {
	 return root;
 }
 
 TreeNode left= LowerstCommentSncetorstor(root.left, p, q);

 TreeNode left= LowerstCommentSncetorstor(root.right, p, q);
 
 if(left !=null && righ != null)
 {
	 return root;
 }
 return left == null ? right :left ; /// right otherwise left
}
}
