package class_09;

import java.util.Stack;

/*
6 https://leetcode.com/problems/daily-temperatures/submissions/
*/	
public class DailyTemperatures {
	public int[] dailyTemperatures(int[] T) {
		int n = T.length;
		Stack<Integer> s = new Stack<>();
		int ans[] = new int[n];
		ans[n - 1] = 0;
		s.push(n - 1);
		for (int i = n - 2; i >= 0; i--) {
			int x = T[i];
			while (!s.isEmpty() && T[s.peek()] <= x)
				s.pop();

			if (s.isEmpty() == false) {
				ans[i] = s.peek() - i;
			}
			s.push(i);
		}
		return ans;
	}
}
