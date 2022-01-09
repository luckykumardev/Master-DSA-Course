package class_32;

import java.util.Arrays;

public class DisjointDS {
	
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
	
	public static void main(String[] args) {
		
        int[] parent = new int[100];
        Arrays.fill(parent, -1);
     
	}

}
