package class_2;

public class ReverseBits {
	
	public int reverseBits(int n) {

		int ans = 0;
		for (int i = 0; i < 32; i++) {
			if (isOn(n, i)) {
				ans = setOn(ans, 31 - i);
			}
		}
		return ans;
	}

	boolean isOn(int n, int i) {
		int mask = 1 << i;
		if ((n & mask) != 0)
			return true;
		else
			return false;
	}

	int setOn(int n, int i) {
		int mask = 1 << i;
		n = n | mask;
		return n;
	}

}
