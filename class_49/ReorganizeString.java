package class_49;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/*
 https://leetcode.com/problems/reorganize-string/
*/
public class ReorganizeString {
	class pair {
		int freq = 0;
		char ch = 'x';

		public pair(char ch, int freq) {
			this.freq = freq;
			this.ch = ch;
		}
	}

	class customComarator implements Comparator<pair> {
		public int compare(pair p1, pair p2) {
			if (p1.freq > p2.freq)
				return -1;
			else
				return 1;
		}
	}

	public String reorganizeString(String S) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < S.length(); i++) {
			hm.put(S.charAt(i), hm.getOrDefault(S.charAt(i), 0) + 1);
		}

		PriorityQueue<pair> pq = new PriorityQueue<>(new customComarator());
		for (Character key : hm.keySet()) {
			pq.add(new pair(key, hm.get(key)));
		}
		StringBuilder sb = new StringBuilder();
		while (pq.size() >= 2) {
			pair p1 = pq.poll();
			pair p2 = pq.poll();

			sb.append(p1.ch);
			sb.append(p2.ch);
			if (p1.freq > 1)
				pq.add(new pair(p1.ch, p1.freq - 1));

			if (p2.freq > 1)
				pq.add(new pair(p2.ch, p2.freq - 1));
		}

		if (pq.size() == 1) {
			pair p = pq.poll();
			if (p.freq > 1)
				return "";
			else
				sb.append(p.ch);
		}

		return sb.toString();
	}
}
