package class_42;

/*
 https://leetcode.com/problems/decode-ways/
*/
public class DecodeWays {
	public int numDecodings(String s) {
		int ans = rec(s, 0);
		return ans;
	}

	private static int rec(String s, int i) {
		int n = s.length();
		if (i == n)
			return 1;

		if (s.charAt(i) == '0') {
			return 0;
		}

		int op1 = rec(s, i + 1);
		int op2 = 0;
		if (i < n - 1 && Integer.parseInt(s.substring(i, i + 2)) <= 26)
			op2 = rec(s, i + 2);

		return op1 + op2;
	}
}