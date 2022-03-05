package class_46;
/*
 https://leetcode.com/problems/delete-operation-for-two-strings/
*/
public class DeleteOperationForTwoStrings {
	
	public int minDistance(String s1, String s2) {
		int ans = rec(s1, s2);
		return ans;
	}

	private static int rec(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();

		if (n1 == 0 || n2 == 0) {
			return Math.max(n1, n2);
		}

		if (s1.charAt(0) == s2.charAt(0)) {
			return rec(s1.substring(1), s2.substring(1));
		}

		int op1 = 1 + rec(s1.substring(1), s2);
		int op2 = 1 + rec(s1, s2.substring(1));

		return Math.min(op1, op2);
	}
}
