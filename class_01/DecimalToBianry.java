package class_01;

/*
 * Implement Integer.toBinary() function
*/
public class DecimalToBianry {

	public static void main(String[] args) {

		int x = 8;
		
		String binary_string = toBinary(x>>1);
		System.out.println(binary_string);
	
	}

	public static String toBinary(int x) {
		StringBuilder sb = new StringBuilder();
		for (int i = 31; i >= 0; i--) {
			if (isIthBitOn(x, i) == true)
				sb.append("1");
			else
				sb.append("0");
		}
		
		return sb.toString();
	}

	public static boolean isIthBitOn(int x, int i) {
		int mask = 1 << i;
		if ((x & mask) != 0)
			return true;
		else
			return false;
	}
}
