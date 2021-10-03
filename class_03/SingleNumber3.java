package class_03;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber3 {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 2, 3, 4 };
		int x = nums[0];
		for (int i = 1; i < nums.length; i++)
			x = x ^ nums[i];

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		int r_mask = x & (-x);

		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & r_mask) == 0)
				list1.add(nums[i]);
			else
				list2.add(nums[i]);
		}

		int ans1 = list1.get(0);
		for (int i = 1; i < list1.size(); i++)
			ans1 = ans1 ^ list1.get(i);

		int ans2 = list2.get(0);
		for (int i = 1; i < list2.size(); i++)
			ans2 = ans2 ^ list2.get(i);

		System.out.println(ans1);
		System.out.println(ans2);

	}
}
