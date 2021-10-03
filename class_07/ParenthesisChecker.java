package class_07;

import java.util.Stack;

/*
   https://leetcode.com/problems/valid-parentheses/
*/
public class ParenthesisChecker {
	public boolean isValid(String st) {
		int n = st.length();
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < n; i++) {
			char ch = st.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				s.push(ch);
			} else {
				if (s.isEmpty()) {
					return false;
				}

				else if ((ch == ']' && s.peek() == '[') || (ch == ')' && s.peek() == '(')
						|| (ch == '}' && s.peek() == '{')) {
					s.pop();
					continue;
				}

				return false;
			}
		}

		if (s.isEmpty() == false)
			return false;
		return true;
	}
}
