package class_42;

/*
 https://leetcode.com/problems/minimum-path-sum/
*/
public class MinimumPathSum {

	public int minPathSum(int[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;
		int ans = rec(0, 0, grid);
		return ans;
	}

	public static int rec(int si, int sj, int grid[][]) {
		int ei = grid.length - 1;
		int ej = grid[0].length - 1;
		if (si == ei && sj == ej)
			return grid[si][sj];

		if (si > ei || sj > ej)
			return Integer.MAX_VALUE;

		int op1 = rec(si + 1, sj, grid);
		int op2 = rec(si, sj + 1, grid);

		return grid[si][sj] + Math.min(op1, op2);
	}
}
