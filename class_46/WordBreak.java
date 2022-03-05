package class_46;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
https://leetcode.com/problems/word-break/
*/
public class WordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {
		HashSet<String> dic = new HashSet<>();
		for (int i = 0; i < wordDict.size(); i++)
			dic.add(wordDict.get(i));

		HashMap<Integer, Boolean> hm = new HashMap<>();
		return rec(s, dic, 0, hm);
	}

	private static boolean rec(String s, HashSet<String> dic, int start, HashMap<Integer, Boolean> hm) {
		int n = s.length();
		if (start == n)
			return true;

		if (hm.containsKey(start))
			return hm.get(start);

		StringBuilder sb = new StringBuilder();
		for (int i = start; i < n; i++) {
			sb.append(s.charAt(i));
			if (dic.contains(sb.toString())) {
				boolean temp = rec(s, dic, i + 1, hm);
				if (temp == true)
					return true;
			}
		}

		hm.put(start, false);
		return false;
	}
}
