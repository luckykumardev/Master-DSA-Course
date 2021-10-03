package class_08;

import java.util.ArrayList;
import java.util.Stack;

/* 
 1 https://practice.geeksforgeeks.org/problems/print-bracket-number4058/1
 */
public class PrintBracketNumber {
	ArrayList<Integer> barcketNumbers(String S) {
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> s = new Stack<>();
		int x = 0;
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c != '(' && c != ')')
				continue;
			if (c == '(') {
				x++;
				s.push(x);
				ans.add(x);
			} else {
				int top = s.pop();
				ans.add(top);
			}
		}
		return ans;
	}
}
