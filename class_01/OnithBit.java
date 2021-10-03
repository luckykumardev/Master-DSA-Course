package class_01;

public class OnithBit {

	
	public static void main(String[] args) {
		
		int x =8;
		String x_binary = Integer.toBinaryString(x);
		
		System.out.println(x_binary);
		
		//on 1st bit from left
		int mask = 1<<2;
		x=x|mask;
		x_binary = Integer.toBinaryString(x);
		
		System.out.println(x_binary);			
	}
	  
	
}
