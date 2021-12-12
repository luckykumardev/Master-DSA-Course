package class_25;

/*
 * https://leetcode.com/problems/island-perimeter/
 */
public class IslandPerimeter {

	  public int islandPerimeter(int[][] grid) {
			int count = 0;
			int r = grid.length;
			int c = grid[0].length;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (grid[i][j] == 1) {
						count +=DFS(grid, i, j);
					}
				}
			}

			return count;
		}

		private static int DFS(int grid[][], int i, int j) {
			int r = grid.length;
			int c = grid[0].length;
			if (i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == 0) {	
				return 1;
			}
		    int count = 0;
	        if (grid[i][j] == -1)
				return 0;

			grid[i][j] = -1;
			count += DFS(grid, i + 1, j);
			count += DFS(grid, i, j + 1);
			count += DFS(grid, i - 1, j);
			count += DFS(grid, i, j - 1);
  	        
			return count;
	    }
		
}
