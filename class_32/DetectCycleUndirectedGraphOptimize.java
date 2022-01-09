package class_32;

import java.util.Arrays;
import java.util.List;

class subset {
	int parent;
	int rank;
}

public class DetectCycleUndirectedGraphOptimize {
	public static void main(String[] args) {

		List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(1, 2), new Edge(2, 3)
		//, new Edge(3, 1) //introduces a cycle in the graph
		);

		if (findCycle(edges, 4)) {
			System.out.println("Cycle Found");
		} else {
			System.out.println("No Cycle is Found");
		}
	}

	private static boolean findCycle(List<Edge> edges, int n) {

		subset[] parent = new subset[n];
		for (int i = 0; i < n; i++) {
			parent[i] =  new subset();
			parent[i].parent = -1;
			parent[i].rank = 0;
		}
		
		for (int i = 0; i < edges.size(); i++) {
			int xL = find(edges.get(i).source, parent);
			int yL = find(edges.get(i).dest, parent);

			if (xL == yL)
				return true;
			union(parent, xL, yL);
		}
		return false;
	}
   
	//union by rank
	private static void union(subset[] parent, int x, int y) {
		int xL = find(x, parent);
		int yL = find(y, parent);

		if (parent[xL].rank < parent[yL].rank)
			parent[xL].parent = yL;
		else if (parent[yL].rank < parent[xL].rank)
			parent[yL].parent = xL;
		else {
			parent[xL].parent = yL;
			parent[yL].rank++;
		}

	}

	//return leader //path 
	private static int find(int i, subset[] parent) {
		if (parent[i].parent == -1)
			return i;
		parent[i].parent = find(parent[i].parent, parent);
		return find(parent[i].parent, parent);
	}
}
