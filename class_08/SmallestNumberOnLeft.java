package class_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
5  https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1
*/
public class SmallestNumberOnLeft {
	static List<Integer> leftSmaller(int n, int a[]) {
		Stack<Integer> s = new Stack<>();
		List<Integer> ans = new ArrayList<>();
		if (n <= 0)
			return ans;
		ans.add(-1);
		s.push(a[0]);
		for (int i = 1; i < n; i++) {
			while (s.size() > 0 && a[i] <= s.peek()) {
				s.pop();
			}

			if (s.size() == 0)
				ans.add(-1);
			else
				ans.add(s.peek());

			s.push(a[i]);
		}
		return ans;
	}
}
