package BinaryTree;

import java.util.Collections;
import java.util.List;

public class serializedeserilze {

	public List<String > serialize(Node node )
	{
		List<String> list = new ArrayList<>();
		helper(node,list);
		return list;
	}

	void helper (Node node ,List<String> string)
	{
		if(node == null)
		{
			list.add("null");
			return ;
		}
		list.add(String.valueOf(node.val));
		
		helper (node.left ,list);
		helper (node.right,list);
	}
	
	Node Deserialize(List<String > list ) //try to converse string as string 
	{
		Collections.reverse(list);
		Node node = helper2(list);
		return node;
	}
	Node helper2(List<String>list)
	{
		String val = list.remove(list.size()-1);
		
		if(val.charAt(0)=='n')// adding with "," it means you can seperate 
		{
			return null;
		}
		Node node =new Node(Integer.parseInt(val));
		
		node.left = helper2(list);
		node.right =helper2(list);
		return node;
	}
}
