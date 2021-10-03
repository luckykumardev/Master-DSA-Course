package class_09;

import java.util.Stack;

/*
 8 https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1
*/
public class TheCelebrityProblem {
	int celebrity(int M[][], int n) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < n; i++)
			s.push(i);

		while (s.size() > 1) {
			int x = s.pop();
			int y = s.pop();
			if (M[x][y] == 1)
				s.push(y);
			else
				s.push(x);
		}

		int z = s.pop();
		for (int i = 0; i < n; i++) {
			if (i == z)
				continue;
			if (M[i][z] == 0)
				return -1;
			if (M[z][i] == 1)
				return -1;

		}

		return z;
	}

}
