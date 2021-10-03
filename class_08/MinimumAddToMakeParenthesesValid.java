package class_08;
import java.util.Stack;
/*
 3 https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 */
public class MinimumAddToMakeParenthesesValid {
	public int minAddToMakeValid(String st) {
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (s.isEmpty() || ch == '(')
				s.push(ch);
			else {
				if (s.peek() == '(')
					s.pop();
				else
					s.push(')');
			}
		}
		return s.size();
	}
}
