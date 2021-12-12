package class_27;

import java.util.LinkedList;
import java.util.Queue;

/*
 https://leetcode.com/problems/01-matrix/
*/
public class Matrix01 {
	
	class Coordinate {
		int x;
		int y;
		int dis;

		Coordinate(int x, int y, int dis) {
			this.x = x;
			this.y = y;
			this.dis = dis;
		}
	}

	public int[][] updateMatrix(int[][] mat) {
		Queue<Coordinate> q = new LinkedList<>();
		int row = mat.length;
		int col = mat[0].length;
		boolean visited[][] = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (mat[i][j] == 0) {
					q.add(new Coordinate(i, j, 1));
					visited[i][j] = true;
				}
			}
		}

		int dir[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				Coordinate temp = q.poll();

				for (int j = 0; j < 4; j++) {
					if (temp.x + dir[j][0] >= row || temp.x + dir[j][0] < 0 || temp.y + dir[j][1] >= col
							|| temp.y + dir[j][1] < 0 || mat[temp.x + dir[j][0]][temp.y + dir[j][1]] == 0
							|| visited[temp.x + dir[j][0]][temp.y + dir[j][1]] == true

					)
						continue;

					q.add(new Coordinate(temp.x + dir[j][0], temp.y + dir[j][1], temp.dis + 1));
					visited[temp.x + dir[j][0]][temp.y + dir[j][1]] = true;
					mat[temp.x + dir[j][0]][temp.y + dir[j][1]] = temp.dis;
				}

			}

		}

		return mat;
	}
}
