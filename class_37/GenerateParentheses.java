package class_37;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/generate-parentheses/
*/
public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList();
		if (n == 0)
			return res;
		String ans = "";
		genrate(n, n, ans, res);
		return res;
	}

	private void genrate(int no, int nc, String ans, List<String> res) {
		if (no == 0 && nc == 0) {
			res.add(ans);
			return;
		}

		if (no == nc) {
			ans += "(";
			genrate(no - 1, nc, ans, res);
		}

		if (no < nc) {
			if (no > 0) {
				ans += "(";
				genrate(no - 1, nc, ans, res);
				ans = ans.substring(0, ans.length() - 1);
			}

			if (nc > 0) {
				ans += ")";
				genrate(no, nc - 1, ans, res);
				ans = ans.substring(0, ans.length() - 1);
			}
		}

		return;
	}

}
