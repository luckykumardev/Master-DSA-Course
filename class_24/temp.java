package class_24;

public class temp {

	public static void main(String[] args) {
		boolean ans = validWordAbbreviation("internationalization", "i12iz4n");
		System.out.println(ans);
	}

	public static boolean validWordAbbreviation(String word, String abbr) {
		int k = 0;
		int i =0;
		while(i < abbr.length()) {
			char c = abbr.charAt(i);
			System.out.println(c + " -- ");
			if (c >= '1' && c <= '9') {
				StringBuilder sb = new StringBuilder();
				while (i < abbr.length() && abbr.charAt(i) >= '1' && abbr.charAt(i) <= '9') {
					// System.out.println(sb.toString() + " ");
//					System.out.println(abbr.charAt(i) + " ");

					c = abbr.charAt(i);
					sb.append(c);
					++i;
				}

				int num = Integer.parseInt(sb.toString());
//				System.out.println(num + " a");
				k += num;

				if (k >= word.length() || word.charAt(k+1) != abbr.charAt(i))
					return false;
			
			} else {
//				System.out.println(k + " b");
				k++;
			 i++;
			}
		}

		return true;
	}

}
