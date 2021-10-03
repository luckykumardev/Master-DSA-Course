package class_01;

public class RsbMask {
	public static void main(String[] args) {
		int x = 10;
		String x_binary = Integer.toBinaryString(x);
		System.out.println(x_binary);
		x = x&(1 + (~x));
		x_binary = Integer.toBinaryString(x);
		System.out.println(x_binary);
		
	}
}
