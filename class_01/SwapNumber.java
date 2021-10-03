package class_01;

public class SwapNumber {

	public static void main(String[] args) {
		int x = 3, y = 4;
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;

		System.out.println(x);
		System.out.println(y);
	}
}
