package class_47;

import java.util.Scanner;

/*
 https://practice.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1
*/
public class MatrixChainMultiplication {

	public static int MatrixChainOrder(int p[], int start, int end) {
		if (start == end)
			return 0;

		int min = Integer.MAX_VALUE;
		for (int k = start; k < end; k++) {
			int count =  MatrixChainOrder(p, start, k) + 
					     MatrixChainOrder(p, k + 1, end) + 
					     p[start - 1] * p[k] * p[end];
			
			if (count < min)
				min = count;
		}
		return min;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = sc.nextInt();
		int memo[][] = new int[n][n];
		int ans = MatrixChainOrder(p, 1, n - 1);
		// int ans = MatrixChainOrder(p);
		System.out.println(ans);
	}
}
