package class_31;

import java.util.Stack;

/*
 https://leetcode.com/problems/simplify-path/
*/
public class SimplifyPath {

	public String simplifyPath(String path) {
		String arr[] = path.split("/");
		Stack<String> s = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			String curr = arr[i];
			if (curr.length() == 0 || curr.equals("."))
				continue;
			else if (curr.equals("..")) {
				if (s.isEmpty() == false)
					s.pop();
			} else
				s.push(curr);
		}

		String ans = "";
		while (!s.isEmpty()) {
			ans = "/" + s.pop() + ans;
		}
		if (ans.length() == 0)
			return "/";
		return ans;
	}

}