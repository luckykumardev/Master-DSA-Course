package class_49;

import java.util.HashMap;

/*
 https://leetcode.com/problems/longest-palindrome/
*/
public class LongestPalindrome {
	public int longestPalindrome(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}

		int ans = 0;
		boolean isFirstOdd = false;
		for (Character key : hm.keySet()) {
			if (hm.get(key) % 2 == 0) {
				ans += hm.get(key);
			} else {
				if (isFirstOdd == false) {
					ans += hm.get(key);
					isFirstOdd = true;
				} else
					ans += hm.get(key) - 1;
			}
		}

		return ans;
	}
}
