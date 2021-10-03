package class_03;

public class TotalSetBitsfrom1toN {
	public static void main(String[] args) {

		int num = 12;
		int bits_count = bitCount(num);
		System.out.println(bits_count);
	}

	private static int bitCount(int num) {
		if (num == 0)
			return 0;
		int prev_pow = findPrevPowerOf2(num);
		int pow = 0;
		while (prev_pow > 0) {
			prev_pow = prev_pow / 2;
			pow++;
		}
		pow--;
		int ans = (int) Math.pow(2, pow - 1) * (pow) + (num - (int) Math.pow(2, pow) + 1)
				+ bitCount(num - (int) Math.pow(2, pow));
		return ans;
	}

	public static int findPrevPowerOf2(int n) {

		while ((n & n - 1) != 0) {
			n = n & n - 1;
		}
		return n;
	}

}
