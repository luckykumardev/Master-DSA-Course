package class_40;

import java.util.HashMap;

/*
 https://leetcode.com/problems/unique-paths/
*/
public class UniquePaths {
	public int uniquePaths(int m, int n) {

		HashMap<String, Integer> mhm = new HashMap<>();
		int ans = rec(0, 0, m - 1, n - 1, mhm);

		return ans;
	}

	public static int rec(int si, int sj, int ei, int ej, HashMap<String, Integer> mhm) {
		if (si == ei && sj == ej)
			return 1;

		if (si > ei || sj > ej)
			return 0;

		String key = si + "#" + sj;
		if (mhm.containsKey(key))
			return mhm.get(key);

		int op1 = rec(si + 1, sj, ei, ej, mhm);
		int op2 = rec(si, sj + 1, ei, ej, mhm);
		mhm.put(key, op1 + op2);
		return op1 + op2;
	}
}
