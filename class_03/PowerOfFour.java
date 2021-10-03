package class_03;

public class PowerOfFour {

	public static void main(String[] args) {
      boolean ans  = isPowerOfTwo(8);
      System.out.println(ans);
      
	}

	public static boolean isPowerOfTwo(int n) {
		int count_On_bits = kerniganAlgo(n);
		if (count_On_bits == 1 && (n % 10 == 4 || n % 10 == 6))
			return true;
		return false;
	}

	private static int kerniganAlgo(int x) {
		int count = 0;
		while (x > 0) {
			int mask = ~(x & (1 + (~x)));
			x = x & mask;
			count++;
		}

		return count;
	}

}
