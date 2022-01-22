package class_36;

import java.util.HashMap;
/*
 https://leetcode.com/problems/sudoku-solver/
*/
public class SudokuSolve {
	
	public void solveSudoku(char[][] board) {
		if (backtrack(board) == true) {
			printSudoku(board);
		} else {
			System.out.println("this sudoku can't be solved");
		}
		HashMap<Character, Integer> hm = new HashMap<>();
	}

	private void printSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private boolean backtrack(char[][] b) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (b[i][j] == '.') {
					for (char k = '1'; k <= '9'; k++) {
						if (isSafe(b, i, j, Character.getNumericValue(k))) {
							b[i][j] = k;
							if (backtrack(b))
								return true;
							b[i][j] = '.';
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isSafe(char board[][], int curr_r, int curr_c, int k) {
		int r = board.length;
		int c = board[0].length;

		char ch = (k + "").charAt(0);
		// check row
		for (int i = 0; i < c; i++) {
			if (i == curr_c)
				continue;
			if (board[curr_r][i] == ch) {
				return false;
			}
		}

		// check col
		for (int i = 0; i < r; i++) {
			if (i == curr_r)
				continue;
			if (board[i][curr_c] == ch) {
				return false;
			}
		}

		// check block
		int box_r = (curr_r / 3) * 3;
		int box_c = (curr_c / 3) * 3;
		for (int i = box_r; i < box_r + 3; i++) {
			for (int j = box_c; j < box_c + 3; j++) {
				if (i == curr_r && j == curr_c)
					continue;
				if (board[i][j] == ch) {
					return false;
				}
			}
		}
		
		return true;
	}
}