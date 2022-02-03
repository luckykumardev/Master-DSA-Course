package class_38;

/*
 https://leetcode.com/problems/word-search/
*/
public class WordSearch {
	public boolean exist(char[][] board, String word) {
		int r = board.length;
		int c = board[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if ((board[i][j] == word.charAt(0)) && DFS(board, i, j, 0, word))
					return true;
			}
		}
		return false;
	}

	private static boolean DFS(char board[][], int i, int j, int k, String word) {
		int r = board.length;
		int c = board[0].length;

		if (k == word.length())
			return true;
		if (i < 0 || i >= r || j < 0 || j >= c || board[i][j] != word.charAt(k))
			return false;

		char curr = board[i][j];

		board[i][j] = '*';
		boolean op1 = DFS(board, i + 1, j, k + 1, word);
		boolean op2 = DFS(board, i, j + 1, k + 1, word);
		boolean op3 = DFS(board, i - 1, j, k + 1, word);
		boolean op4 = DFS(board, i, j - 1, k + 1, word);
		board[i][j] = curr;
		
		return op1 || op2 || op3 || op4;

	}
}
