package class_43;
/*
 https://leetcode.com/problems/longest-palindromic-subsequence/
*/
public class LongestPalindromicSubsequence {
	public int longestPalindromeSubseq(String s) {
		if (s.length() == 0)
			return 0;
		int ans = rec(s, 0, s.length() - 1, 0);
		return ans;
	}

	private static int rec(String s, int i, int j, int ans) {
		if (i > j)
			return 0 + ans;
		if (i == j)
			return 1 + ans;

		char c1 = s.charAt(i);
		char c2 = s.charAt(j);

		if (c1 == c2) {
			return rec(s, i + 1, j - 1, ans + 2);
		} else {
			int op1 = rec(s, i + 1, j, ans);
			int op2 = rec(s, i, j - 1, ans);
			return Math.max(op1, op2);
		}
	}
}
