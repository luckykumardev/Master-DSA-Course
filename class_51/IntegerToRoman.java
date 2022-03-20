package class_51;

/*
 https://leetcode.com/problems/integer-to-roman/
*/
public class IntegerToRoman {
	public String intToRoman(int num) {
		String thousands[] = { "", "M", "MM", "MMM" };
		String hundreds[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String tens[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String ones[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		StringBuilder sb = new StringBuilder();

		int x = num / 1000;
		sb.append(thousands[x]);
		num = num % 1000;

		x = num / 100;
		sb.append(hundreds[x]);
		num = num % 100;

		x = num / 10;
		sb.append(tens[x]);
		num = num % 10;

		x = num / 1;
		sb.append(ones[x]);
		num = num % 1;

		return sb.toString();

	}
}
