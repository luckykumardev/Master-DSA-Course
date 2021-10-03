package class_02;

public class Round_up_to_the_previous_power_of_2 {

	public static int findNextPowerOf2(int n) {
		
		while ((n & n - 1) != 0) {
			n = n & n - 1;
		}

		return n;
	}

	public static void main(String[] args) {
		int n = 31;
		
		System.out.println("The next power of 2 is " + findNextPowerOf2(n));
	}
}