package class_14;

/*
Input :-
 aabccba
Output :-
 abcba
*/
public class RemoveAllAdjacentDuplicatesInString {

	public static void main(String[] args) {
		String ans = removeDuplicate("coooooodddebiiiiix");
		System.out.println(ans);
	}

	private static String removeDuplicate(String s) {
		 if(s.length() <= 1)
			 return s;
		 if(s.charAt(0) == s.charAt(1)){
			 return removeDuplicate(s.substring(1));
		 }else{
			 String smallAns = removeDuplicate(s.substring(1));
		     return s.charAt(0) +smallAns;
		 }
	}
}
