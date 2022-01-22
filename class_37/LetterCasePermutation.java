package class_37;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/letter-case-permutation/
*/
public class LetterCasePermutation {
	public List<String> letterCasePermutation(String S) {
		List<String> ans = new ArrayList<>();
		compute(ans, S.toCharArray(), 0);
		return ans;
	}

	public void compute(List<String> ans, char[] chars, int index) {
		if (index == chars.length)
			ans.add(new String(chars));
		
			if (Character.isLetter(chars[index])) {
				chars[index] = Character.toLowerCase(chars[index]);
				compute(ans, chars, index + 1);
				chars[index] = Character.toUpperCase(chars[index]);
			}
			compute(ans, chars, index + 1);
		
	}
}
