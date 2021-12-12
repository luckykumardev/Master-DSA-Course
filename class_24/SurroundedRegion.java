package class_24;

public class SurroundedRegion {
	
	public void solve(char[][] board) {
		if (board.length == 0)
			return;

		int r = board.length;
		int c = board[0].length;

		for (int i = 0; i < r; i++) {
			if (board[i][0] == 'O')
				DFS(board, i, 0);
			if (board[i][c - 1] == 'O')
				DFS(board, i, c - 1);
		}

		for (int i = 0; i < c; i++) {
			if (board[0][i] == 'O')
				DFS(board, 0, i);
			if (board[r - 1][i] == 'O')
				DFS(board, r - 1, i);
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (board[i][j] == 'O')
					board[i][j] = 'X';
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (board[i][j] == '#')
					board[i][j] = 'O';
			}
		}

	}

	private static void DFS(char board[][], int i, int j) {
		int r = board.length;
		int c = board[0].length;
		if (i < 0 || i >= r || j < 0 || j >= c || board[i][j] == 'X' || board[i][j] == '#')
			return;

		board[i][j] = '#';

		DFS(board, i + 1, j);
		DFS(board, i, j + 1);
		DFS(board, i - 1, j);
		DFS(board, i, j - 1);
	}
}
