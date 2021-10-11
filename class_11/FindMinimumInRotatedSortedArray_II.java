package class_11;

public class FindMinimumInRotatedSortedArray_II {
	public int findMin(int[] nums) {
		int s = 0;
		int e = nums.length - 1;
		while (s < e) {
			int m = s + (e - s) / 2;
			if (nums[m] > nums[e])
				s = m + 1;
			else if (nums[m] < nums[e])
				e = m;
			else
				e--;
		}
		return nums[s];
	}
}