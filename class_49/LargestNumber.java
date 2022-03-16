package class_49;

import java.util.Arrays;
import java.util.Comparator;

/*
 https://leetcode.com/problems/largest-number/
*/
public class LargestNumber {
	public String largestNumber(int[] nums) {

		String arr[] = new String[nums.length];
		for (int i = 0; i < nums.length; i++)
			arr[i] = "" + nums[i];

		StringBuilder sb = new StringBuilder();
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String x, String y) {
				return (x + y).compareTo(y + x);
			}
		});
		for (int i = arr.length - 1; i >= 0; i--)
			sb.append(arr[i]);
		while (sb.length() != 0 && sb.charAt(0) == '0')
			sb.deleteCharAt(0);

		if (sb.length() == 0)
			sb.append("0");
		return sb.toString();
	}
}
