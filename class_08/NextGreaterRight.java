package class_08;

import java.util.Stack;
/*
 4 https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
*/	
public class NextGreaterRight {
	public static long[] nextLargerElement(long[] arr, int n) {
		Stack<Long> s = new Stack<>();
		long[] ans = new long[n];
		if (n <= 0)
			return ans;
		ans[n - 1] = -1;
		s.push(arr[n - 1]);
		for (int i = n - 2; i >= 0; i--) {
			while (s.size() > 0 && arr[i] >= s.peek()) {
				s.pop();
			}

			if (s.size() == 0)
				ans[i] = -1;
			else
				ans[i] = s.peek();

			s.push(arr[i]);
		}
		return ans;
	}
}
