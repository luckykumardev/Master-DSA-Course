package class_02;

public class kernighansAlgorithm {

	public static void main(String[] args) {
		int x  = 9;
		
		int count_On_bits = kerniganAlgo(x);
		System.out.println(count_On_bits);
	}

	private static int kerniganAlgo(int x) {
	  int count  = 0;
	  while(x != 0){
		  int mask = ~(x&(1 + (~x)));
		  x = x&mask;
		  count++;
	  }
		
	  return count;
	}
}
