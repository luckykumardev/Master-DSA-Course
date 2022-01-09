package class_34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupShiftedStrings {
	public List<List<String>> groupStrings(String[] strings) {
		List<List<String>> res = new ArrayList<>();
		HashMap<String, List<String>> asciiGroupMap = new HashMap<>();
		for (int i = 0; i < strings.length; i++) {
			String asciString = findAsciiString(strings[i]);
			if (asciiGroupMap.containsKey(asciString) == false)
				asciiGroupMap.put(asciString, new ArrayList<>());

			asciiGroupMap.get(asciString).add(strings[i]);
		}

		for (String key : asciiGroupMap.keySet()) {
			List<String> temp = asciiGroupMap.get(key);
			res.add(temp);
		}

		return res;
	}

	private String findAsciiString(String s) {
		if (s.length() == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		sb.append('#');
		for (int i = 0; i < s.length() - 1; i++) {
			int diff = (int) s.charAt(i + 1) - (int) s.charAt(i);
			if (diff < 0)
				diff = 26 + diff;
			sb.append(diff + "#");
		}

		return sb.toString();
	}
}
