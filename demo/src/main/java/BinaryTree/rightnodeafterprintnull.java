package BinaryTree;

import ch.qos.logback.core.pattern.parser.Node;

public class rightnodeafterprintnull {
	//				1
	//       /            \
	///      2				3
	///     / \            /  \
	///	   4   5 		  6    7
	/// input[1,2,3,4,5,6,7]
	/// output [1,#, 2,3,#4,5,6,7,#]

	public Node connect (Node root)
	{
		if (root== null)
		{return null;
		}
		
		Node leftMost = root;
		while(leftMost.left != null)
		{ 
			Node current= leftMost;
			while(current!= null)
			{
				current.left.next = current.right;
				//connect 4 and 5 
				if(current.next != null)
				{
					current.right.next = current.next.left;
				}
				current = current.next;// connect wiht 2 and three
			}
			//after while loopp level is over
            leftMost = leftMost.left; // got to 4 (next level and previsounode .left)
			
		}
		return root;
	}
}
