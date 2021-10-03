package class_09;

/*
 7 https://leetcode.com/problems/online-stock-span/  NGE left
*/	

import java.util.Stack;
public class OnlineStockSpan {
	Stack<Node> st;

	public OnlineStockSpan() {
		st = new Stack<>();
	}

	public int next(int price) {
		int count = 0;
		while (!st.isEmpty() && st.peek().val <= price) {
			count += st.peek().del;
			st.pop();
		}
		count++;
		st.push(new Node(price, count));
		return count;
	}

	static class Node {
		int val;
		int del;

		public Node(int val, int del) {
			this.val = val;
			this.del = del;
		}

	}
}
