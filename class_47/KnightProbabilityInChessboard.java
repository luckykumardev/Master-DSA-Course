package class_47;

/*
 https://leetcode.com/problems/knight-probability-in-chessboard/
*/
public class KnightProbabilityInChessboard {
	private int[][] dir = { { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }, { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 } };

	public double knightProbability(int N, int K, int r, int c) {
		return find(N, K, r, c);
	}

	public double find(int N, int K, int r, int c) {
		if (isValid(r, c, N) == false)
			return 0;
		if (K == 0)
			return 1;

		double Probability = 0;
		for (int i = 0; i < dir.length; i++) {
			Probability += find(N, K - 1, r + dir[i][0], c + dir[i][1]) / 8.0;
		}

		return Probability;
	}

	private boolean isValid(int r, int c, int N) {
		if (r < 0 || r >= N || c < 0 || c >= N)
			return false;
		return true;
	}
}