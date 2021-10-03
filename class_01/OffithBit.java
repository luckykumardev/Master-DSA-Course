package class_01;

public class OffithBit {
	public static void main(String[] args) {
		
		int x  =8;
		String x_binary = Integer.toBinaryString(x);
		System.out.println(x_binary);
		
		//off 1st bit from left
		int mask = ~(1<<3);
		x=x&mask;
		x_binary = Integer.toBinaryString(x);
		
		System.out.println(x_binary);
		
	}
}
