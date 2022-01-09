package class_34;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length())
			return false;
		int n = s.length();
		Map<Character, Character> hm = new HashMap<>();
		Map<Character, Character> hm2 = new HashMap<>();

		for (int i = 0; i < n; i++) {
			char sc = s.charAt(i);
			char tc = t.charAt(i);
			if (hm.containsKey(sc) && tc != hm.get(sc))
				return false;
			hm.put(sc, tc);

			if (hm2.containsKey(tc) && sc != hm2.get(tc))
				return false;
			hm2.put(tc, sc);

		}
		return true;
	}
}
