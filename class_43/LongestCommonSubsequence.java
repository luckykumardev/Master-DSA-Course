package class_43;

/*
 https://leetcode.com/problems/longest-common-subsequence/
*/
public class LongestCommonSubsequence {
	public int longestCommonSubsequence(String s1, String s2) {

		int ans = rec(s1, s2);
		return ans;
	}

	public static int rec(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		if (n1 == 0 || n2 == 0)
			return 0;

		if (s1.charAt(0) == s2.charAt(0)) {
			return 1 + rec(s1.substring(1), s2.substring(1));
		}

		int op1 = rec(s1.substring(1), s2);
		int op2 = rec(s1, s2.substring(1));

		return Math.max(op1, op2);
	}
}
