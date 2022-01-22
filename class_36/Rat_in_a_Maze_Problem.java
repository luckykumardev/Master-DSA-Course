package class_36;

import java.util.ArrayList;
import java.util.List;

public class Rat_in_a_Maze_Problem {

	static List<String> possiblePaths = new ArrayList<>();
	static String path = "";

	static boolean isSafe(int row, int col, int m[][], int n) {
		if (row <= -1 || row >= n || col <= -1 || col >= n || m[row][col] == 0)
			return false;

		return true;
	}

	static void printPathHelper(int row, int col, int m[][], int n) {
		
		if (row == n - 1 && col == n - 1) {
			possiblePaths.add(path);
			return;
		}

		if(isSafe(row, col, m, n)) {
				path += 'D';
				printPathHelper(row + 1, col, m, n);
				path = path.substring(0, path.length() - 1);
				path += 'R';
				printPathHelper(row, col + 1, m, n);
			  	path = path.substring(0, path.length() - 1);
		}		 
	}

	public static void main(String[] args) {
		int arr[][] = { 
				{ 1, 0, 0, 0}, 
				{ 1, 1, 0, 0}, 
				{ 1, 1, 1, 0}, 
				{ 0, 0, 1, 1}
			    };
		int n = arr.length;
        
		printPathHelper(0, 0,arr, n);
		
		for (int i = 0; i < possiblePaths.size(); i++)
			System.out.print(possiblePaths.get(i) + " ");

	}
}