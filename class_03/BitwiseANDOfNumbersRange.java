package class_03;

public class BitwiseANDOfNumbersRange {
	public int rangeBitwiseAnd(int m, int n) {
		int shift_right = 0;
		while (m != n) {
			m = m >> 1;
			n = n >> 1;
			shift_right++;
		}
		return m << shift_right;
	}
}
