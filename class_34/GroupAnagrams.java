package class_34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<>();
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char arr[] = strs[i].toCharArray();
			Arrays.sort(arr);
			StringBuilder sb = new StringBuilder();
			for (int p = 0; p < arr.length; p++)
				sb.append(arr[p]);
			String curr = sb.toString();
			if (!hm.containsKey(curr))
				hm.put(curr, new ArrayList<>());
			hm.get(curr).add(strs[i]);
		}

		for (String Key : hm.keySet()) {
			res.add(new ArrayList<>(hm.get(Key)));
		}

		return res;
	}
}
