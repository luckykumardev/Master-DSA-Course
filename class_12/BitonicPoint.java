package class_12;
/*
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */	
public class BitonicPoint {
	public int peakIndexInMountainArray(int[] arr) {
		int l = 0, h = arr.length - 1;
		while (l <= h) {
			int m = l + (h - l) / 2;
			if ((arr[m] > arr[m + 1]) && (arr[m] > arr[m - 1]))
				return m;
			else if ((arr[m] > arr[m + 1]) && (arr[m] < arr[m - 1]))
				h = m - 1;
			else
				l = m + 1;
		}
		return -1;
	}
	
}