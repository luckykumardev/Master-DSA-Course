package class_08;

import java.util.Stack;

/*
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 */	
public class LargestAreaOfHistogram {
	public int largestRectangleArea(int[] heights) {
		int n = heights.length;
		if (n == 0)
			return 0;
		int nse_left[] = calculate_nse_left(heights);
		int nse_right[] = calculate_nse_right(heights);

		int ans = 0;
		for (int i = 0; i < n; i++)
			ans = Math.max(ans, heights[i] * (nse_right[i] - nse_left[i] - 1));

		return ans;
	}

	private static int[] calculate_nse_left(int heights[]) {
		int n = heights.length;
		int ans[] = new int[n];
		Stack<Integer> s = new Stack<>();
		ans[0] = -1;
		s.push(0);
		for (int i = 1; i < n; i++) {
			while (!s.isEmpty() && heights[i] <= heights[s.peek()])
				s.pop();
			if (s.isEmpty())
				ans[i] = -1;
			else
				ans[i] = s.peek();
			s.push(i);
		}
		return ans;
	}

	private static int[] calculate_nse_right(int heights[]) {
		int n = heights.length;
		int ans[] = new int[n];
		Stack<Integer> s = new Stack<>();
		ans[n - 1] = n;
		s.push(n - 1);
		for (int i = n - 2; i >= 0; i--) {
			while (!s.isEmpty() && heights[i] <= heights[s.peek()])
				s.pop();
			if (s.isEmpty())
				ans[i] = n;
			else
				ans[i] = s.peek();
			s.push(i);
		}
		return ans;
	}

}
