package class_11;

/*
 https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
*/
public class FindFloor {
	
	static int findFloor(long arr[], int n, long x) {
		int low = 0, high = n - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				high = mid - 1;
			else {
				low = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}
}
