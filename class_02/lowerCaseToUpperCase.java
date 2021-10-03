package class_02;

public class lowerCaseToUpperCase {
	
	public static void main(String[] args) {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println((char)(ch & '_'));
		}	
		
	}
}
