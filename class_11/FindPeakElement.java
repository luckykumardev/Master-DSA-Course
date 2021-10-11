package class_11;

public class FindPeakElement {
	public int findPeakElement(int[] nums) {
		int l = 0, r = nums.length - 1;
		while (l < r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] > nums[mid + 1])
				r = mid;
			else if (mid > -1 && mid < nums.length && nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
				return mid;
			} else
				l = mid + 1;
		}
		return l;
	}
}
