package class_01;

public class SameSignOrNot {

	public static void main(String[] args) {
		int x = -9;
		int y = -9;

		System.out.println(x + " in binary is " + Integer.toBinaryString(x));
		System.out.println(y + " in binary is " + Integer.toBinaryString(y));

		boolean isOpposite = ((x ^ y) < 0);

		if (isOpposite) {
			System.out.println(x + " and " + y + " have opposite signs");
		} else {
			System.out.println(x + " and " + y + " don't have opposite signs");
		}
	}

}
