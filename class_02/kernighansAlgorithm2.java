package class_02;

public class kernighansAlgorithm2 {
	
	public static void main(String[] args) {
		int n = 9;
		int count = 0;
		while(n != 0){
			n = (n&(n-1));
			count++;
		}
		System.out.println(count);
	}
}