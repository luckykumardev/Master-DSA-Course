package class_48;

/*
 https://practice.geeksforgeeks.org/problems/palindromic-patitioning4845/1/
*/
public class PalindromePartitioningRecursive {
	
	static int palindromicPartition(String str) {
		return mpc(str, 0, str.length() - 1);
	}

	public static int mpc(String st, int s, int e) {

		if (isPalandromic(st, s, e))
			return 0;

		int min = Integer.MAX_VALUE;
		for (int cp = s; cp < e; cp++) {
			int mpc1 = mpc(st, s, cp);
			int mpc2 = mpc(st, cp + 1, e);
			int totalcost = mpc1 + mpc2 + 1;

			if (min > totalcost)
				min = totalcost;
		}
		return min;
	}

	private static boolean isPalandromic(String st, int s, int e) {
		while (s < e) {
			if (st.charAt(s) != st.charAt(e))
				return false;
			s++;
			e--;
		}
		return true;
	}
}
