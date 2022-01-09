package class_33;

import java.util.HashMap;

public class temp {
	public int romanToInt(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);

		int ans = 0;
		int n = s.length();
		for (int i = n - 1; i >= 0; i--) {
			int temp = hm.get(s.charAt(i));
			if (i > 0 && hm.get(s.charAt(i)) > hm.get(s.charAt(i - 1))) {
				temp -= hm.get(s.charAt(i - 1));
				i--;
			}
			ans += temp;
		}

		return ans;
	}

}
