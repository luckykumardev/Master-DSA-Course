package class_27;

import java.util.LinkedList;
import java.util.Queue;

/*
 https://practice.geeksforgeeks.org/problems/steps-by-knight5927/1#
*/
public class StepsByKnight {
	class Coordinate {
		int x;
		int y;

		Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N) {

		int dx[] = { -2, -2, -1, -1, 1, 2, 2, 1 };
		int dy[] = { -1, 1, 2, -2, -2, -1, 1, 2 };

		boolean visited[][] = new boolean[N][N];
		Queue<Coordinate> q = new LinkedList<>();
		q.add(new Coordinate(KnightPos[0] - 1, KnightPos[1] - 1));
		int ans = 0;
		while (q.isEmpty() == false) {
			int size = q.size();

			for (int i = 0; i < size; i++) {
				Coordinate temp = q.poll();
				if (temp.x == TargetPos[0] - 1 && temp.y == TargetPos[1] - 1)
					return ans;

				for (int j = 0; j < 8; j++) {

					if (temp.x + dx[j] < 0 || temp.x + dx[j] >= N || temp.y + dy[j] < 0 || temp.y + dy[j] >= N
							|| visited[temp.x + dx[j]][temp.y + dy[j]] == true)
						continue;

					visited[temp.x + dx[j]][temp.y + dy[j]] = true;
					q.add(new Coordinate(temp.x + dx[j], temp.y + dy[j]));
				}
			}

			ans++;
		}

		return ans;
	}
}
