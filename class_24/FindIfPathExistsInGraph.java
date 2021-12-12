package class_24;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/find-if-path-exists-in-graph/
*/
public class FindIfPathExistsInGraph {
	public boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>> adjList =  new ArrayList();
        for(int i=0; i <n; i++){
            List<Integer> temp = new ArrayList<>();
            adjList.add(temp);
        }
        
        for(int i =0; i <edges.length; i++){
            int sv = edges[i][0];
            int ev = edges[i][1];
            adjList.get(sv).add(ev);
            adjList.get(ev).add(sv);
        }
        
        boolean visited[] = new boolean[n];
        
        boolean containsPath = printHelper(adjList, visited, start, end);
        return containsPath;
    }
    
    
	private static boolean printHelper(List<List<Integer>> adjList, boolean visited[], int sv, int end) {
		if(sv == end)
            return true;
		
        visited[sv] = true;
        boolean ans =  false;
        List<Integer> children = adjList.get(sv);
		for (int i = 0; i < children.size(); i++) {
			int x = children.get(i);
			if (visited[x] == false)
				ans =  printHelper(adjList, visited, x, end);
		    if(ans == true)
                return ans;
        }
        
        return ans;
	}

}
