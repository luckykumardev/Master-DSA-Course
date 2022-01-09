package class_32;

import java.util.Arrays;
import java.util.List;

class Edge
{
    int source, dest;
 
    public Edge(int source, int dest)
    {
        this.source = source;
        this.dest = dest;
    }
}
public class DetectCycleUndirectedGraph {
	
	public static void main(String[] args) {

        List<Edge> edges = Arrays.asList(
                        new Edge(0, 1), 
                        new Edge(1, 2), 
                        new Edge(2, 3)
                       // new Edge(3, 1) //introduces a cycle in the graph
                    );
 
        if (findCycle(edges, 4)) {
            System.out.println("Cycle Found");
        }
        else {
            System.out.println("No Cycle is Found");
        }
	}
	
	private static boolean findCycle(List<Edge> edges, int n) {
      
		
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
     
		for(int i =0; i <edges.size(); i++){
				int xL = find(edges.get(i).source, parent);
				int yL = find(edges.get(i).dest, parent);	
			
				if(xL == yL)
					return true;
				union(parent, xL, yL);
		}
		return false;
	}

	private static void union(int[] parent, int x, int y) {
		int xL = find(x, parent);
		int yL = find(y, parent);	

		parent[xL] = yL;
	}

	private static int find(int i, int[] parent) {
	    if (parent[i] == -1)
            return i;
        return find(parent[i], parent);
	}
	
}
