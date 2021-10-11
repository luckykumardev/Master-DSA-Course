package class_12;

/*
 * https://www.interviewbit.com/problems/search-in-bitonic-array/#
 */
public class FindAnElementInBitonicArray {

	public int solve(int[] A, int B) {
		int biton_point = peakIndexInMountainArray(A);
		int ans1 = ascendingBinarySearch(A, 0, biton_point, B);
		int ans2 = descendingBinarySearch(A, biton_point, A.length - 1, B);

		return Math.max(ans1, ans2);
	}

	int descendingBinarySearch(int arr[], int low, int high, int key) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] < key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	int ascendingBinarySearch(int arr[], int low, int high, int key) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

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
