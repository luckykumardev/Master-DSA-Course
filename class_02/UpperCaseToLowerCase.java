package class_02;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
		
		for (char ch = 'A'; ch <= 'Z'; ch++) 
	    	  System.out.println((char)(ch | ' '));
	}
}
