package class_01;

public class Check_if_it_bit_is_on {

	public static void main(String[] args) {
		int x = 8;
		int i = 3;
		
		int mask = 1<<i;
		System.out.println("Binary representations of " + x + " : " +  Integer.toBinaryString(x));
		if((x&mask) != 0){
			System.out.println(i +"th Bit is On");
		}else{
			System.out.println(i +"th Bit is Off");
		}
		
	}
}
