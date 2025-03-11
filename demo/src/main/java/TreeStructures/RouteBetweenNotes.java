package TreeStructures;

import java.util.LinkedList;

import javax.validation.Path.Node;

import org.hibernate.graph.Graph;

public class RouteBetweenNotes {

	enum State {Unvistied ,Visisted , Visiting }
	
	boolean search (Graph g , Node Start , Node End )
	{
		if (Start == End ) return true;
		
		LinkedList <Node> q = new LinkedList<>();
		
		for (Node u : g.getNodes())
		{
			u.State = State.Unvisted ;
		}
		Start.State = State.Visiting; 
		q.add((start);
		Node u; 
		While (!q.isEmpty())
		{
			u = q.removeFirst();
			if(u!=null)
			{
				for (Node v : u.getAdjacent))
		{
			if (v.state == State.Unvistied)
			{
				if(v== End )
				{
					return true;
				}
				else 
				{
					v.State = State.Visiting; 
					q.add(v);
				}
			}
		}
			}
		}
		return false;
		
		
	}
	
	
}
