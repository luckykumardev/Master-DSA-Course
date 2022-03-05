package class_44;

import java.util.HashMap;

/*
 https://leetcode.com/problems/uncrossed-lines/
*/
public class UncrossedLines {
	public int maxUncrossedLines(int[] A, int[] B) {
		HashMap<String, Integer> hm = new HashMap<>();
		return rec(A, 0, B, 0, hm);
	}

	private int rec(int[] A, int i, int[] B, int j, HashMap<String, Integer> hm) {
		if (i == A.length || j == B.length)
			return 0;
		String key = i + "c" + j;
		int count = 0;
		if (hm.containsKey(key))
			return hm.get(key);
		if (A[i] == B[j])
			count = 1 + rec(A, i + 1, B, j + 1, hm);
		else
			count += Math.max(rec(A, i + 1, B, j, hm), rec(A, i, B, j + 1, hm));
		hm.put(key, count);
		return count;
	}
}