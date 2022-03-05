package class_44;

import java.util.HashMap;

/*
 https://leetcode.com/problems/ones-and-zeroes/
*/
public class OnesAndZeroes {
	public int findMaxForm(String[] strs, int m, int n) {
		HashMap<String, Integer> hm = new HashMap<>();
		int ans = rec(strs, m, n, 0, hm);
		return ans;
	}

	private static int rec(String strs[], int zero_left, int one_left, int curr, HashMap<String, Integer> hm) {
		int len = strs.length;
		if (curr == len)
			return 0;
		String key = zero_left + "code" + one_left + "bix" + curr;
		if (hm.containsKey(key))
			return hm.get(key);
		String st = strs[curr];
		int one = 0;
		int zero = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == '1')
				one++;
			else
				zero++;
		}

		int op1 = 0;
		if (one <= one_left && zero <= zero_left)
			op1 = 1 + rec(strs, zero_left - zero, one_left - one, curr + 1, hm);

		int op2 = rec(strs, zero_left, one_left, curr + 1, hm);

		hm.put(key, Math.max(op1, op2));
		return Math.max(op1, op2);
	}
}
