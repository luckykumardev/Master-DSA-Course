package class_01;

public class ToggleithBit {

	public static void main(String[] args) {
		int x = 8;
		String x_binary = Integer.toBinaryString(x);

		System.out.println(x_binary);
	
		// toggle 2nd bit from left
		int mask = 1<<2;
		x = x^mask;
		x_binary = Integer.toBinaryString(x);
		System.out.println(x_binary);
	}
}
