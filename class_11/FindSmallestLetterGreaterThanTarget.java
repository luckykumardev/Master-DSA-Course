package class_11;

/*
 https://leetcode.com/problems/find-smallest-letter-greater-than-target/
*/
public class FindSmallestLetterGreaterThanTarget {
	public char nextGreatestLetter(char[] letters, char target) {
		int i = 0;
		int start = 0;
		int end = letters.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (letters[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid - 1;
				ans = mid;
			}
		}
		if (ans == -1) {
			if (target > letters[0])
				return letters[0];
			else
				return letters[letters.length - 1];
		}
		return letters[ans];
	}
}
