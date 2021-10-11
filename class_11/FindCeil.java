package class_11;

public class FindCeil {
	static int findCeil(long arr[], int n, long x) {
		int low = 0, high = n - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == x)
				return mid;
			if (arr[mid] < x)
				low = mid + 1;
			else {
				high = mid - 1;
				ans = mid;
			}
		}
		return ans;
	}
}
