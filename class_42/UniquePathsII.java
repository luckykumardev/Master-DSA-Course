package class_42;
/*
 https://leetcode.com/problems/unique-paths-ii/	
*/	
public class UniquePathsII {
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int ans = rec(obstacleGrid, 0, 0, 0);
		return ans;
	}

	private static int rec(int grid[][], int sr, int sc, int m) {
		int dr = grid.length - 1;
		int dc = grid[0].length - 1;
		if (sr > dr || sc > dc || grid[sr][sc] == 1)
			return 0;
		if (sr == dr && sc == dc) {
			return 1;
		}

		int op1 = rec(grid, sr + 1, sc, m + 1);
		int op2 = rec(grid, sr, sc + 1, m + 1);

		return op1 + op2;
	}
}