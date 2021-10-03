package class_03;

public class MaxConsecutiveOnes {
	private static int maxConsecutiveOnes(int x) {
		int count = 0;
		while (x != 0) {
			x = (x & (x << 1));
			count++;
		}
		
		return count;
	}

	public static void main(String strings[]) {
		System.out.println(maxConsecutiveOnes(7));
		System.out.println(maxConsecutiveOnes(-1));
	}
}
